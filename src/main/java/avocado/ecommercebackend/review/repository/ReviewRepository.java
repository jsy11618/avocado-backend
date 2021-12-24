package avocado.ecommercebackend.review.repository;

import avocado.ecommercebackend.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
