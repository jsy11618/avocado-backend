package avocado.ecommercebackend.review.model;


import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.user.model.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @Builder
    public Review(String text, User user, Product product) {
        this.text = text;
        this.user = user;
        this.product = product;
    }
}
