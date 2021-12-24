package busanprojectday2.avocadoday2.review.repository;

import busanprojectday2.avocadoday2.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
