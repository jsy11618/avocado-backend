package avocado.ecommercebackend.category.model;

import avocado.ecommercebackend.product.model.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int type;
    private String categoryName;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Builder
    public Category(int type, String categoryName, Product product) {
        this.type = type;
        this.categoryName = categoryName;
        this.product = product;
    }
}
