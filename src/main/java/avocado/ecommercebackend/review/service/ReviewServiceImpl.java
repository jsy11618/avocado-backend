package avocado.ecommercebackend.review.service;

import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview() {
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getReview(Long id) {
        return Optional.ofNullable(reviewRepository.findById(id)).get();
    }
}
