package avocado.ecommercebackend.review.model;


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
    private String createDate;
    private String updateDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


//    @ManyToOne
//    @JoinColumn(name="product_id")
//    private Product product;

    public String getText() {
        return text;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public User getUser() {
        return user;
    }

    //public Product getProduct(){return product;}

    @Builder
    public Review(String text, String createDate, String updateDate, User user) {
        this.text = text;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.user = user;
//        this.product=product;
    }
}
