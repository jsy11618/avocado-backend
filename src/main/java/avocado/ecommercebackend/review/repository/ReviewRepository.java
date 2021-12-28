package avocado.ecommercebackend.review.repository;

import avocado.ecommercebackend.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByUserId(Long id);
    List<Review> findAllByProductId(Long id);
}
