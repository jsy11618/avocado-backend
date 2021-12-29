package avocado.ecommercebackend.review.service;

import avocado.ecommercebackend.product.service.ProductService;
import avocado.ecommercebackend.review.dto.IReview;
import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.repository.ReviewRepository;
import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;
    private final ProductService productService;
    private final UserService userService;


    @Override
    public List<Review> getAllByProductId(Long id) {
        return reviewRepository.findAllByProductId(id);
    }

    @Override
    public List<Review> getAllByUserId(Long id) {
        return reviewRepository.findAllByUserId(id);
    }

    @Override
    public Review addReview(IReview iReview) {
        return reviewRepository.save(
                Review.builder()
                        .user(userService.getUser(iReview.getUserId()).get())
                        .product(productService.getProduct(iReview.getProductId()).get())
                        .text(iReview.getText())
                        .build()

        );
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
