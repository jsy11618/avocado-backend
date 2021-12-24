package avocado.ecommercebackend.reviewList.model;


import avocado.ecommercebackend.user.model.User;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ReviewList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

//    @ManyToOne
//    @JoinColumn(name="product_id")
//    private Product product;


    public ReviewList() {
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    @Builder
    public ReviewList(Long id, User user) {
        this.id = id;
        this.user = user;
    }
}

