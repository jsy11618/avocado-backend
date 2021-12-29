package avocado.ecommercebackend.review.service;

import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class ReviewServiceImpl implements ReviewService{


    private final ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        log.info("새로운 리뷰를 저장했습니다. : {}", review.getText());
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview() {
        log.info("모든 리뷰를 불러왔습니다.");
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getReview(Long id) {
        log.info("해당 리뷰를 아이디로 찾아왔습니다. {}", id);
        return Optional.ofNullable(reviewRepository.findById(id)).get();
    }
}
