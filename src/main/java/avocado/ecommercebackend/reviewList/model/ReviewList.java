package busanprojectday2.avocadoday2.reviewList.model;

import busanprojectday2.avocadoday2.users.model.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

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
