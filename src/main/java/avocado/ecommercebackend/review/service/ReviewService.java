package avocado.ecommercebackend.review.service;

import avocado.ecommercebackend.review.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {
    Review addReview(Review review);
    List<Review> getAllReview();
    Optional<Review> getReview(Long id);
}
