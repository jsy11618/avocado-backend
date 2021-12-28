package avocado.ecommercebackend.review.controller;

import avocado.ecommercebackend.product.service.ProductService;
import avocado.ecommercebackend.review.dto.IReview;
import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.service.ReviewService;
import avocado.ecommercebackend.reviewList.dto.IReviewList;
import avocado.ecommercebackend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequiredArgsConstructor
@RestController
@RequestMapping("/api")  //원래 "/review"였음.
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/rv/addReview")
    public Review addReview(@RequestBody IReview iReview){
        return reviewService.addReview(iReview);
    }

    @GetMapping("/rv/getAll")
    public List<Review> getALLReview(){
        return reviewService.getAllReview();
    }

    @GetMapping("/rv/getAllByProductId/{id}")
    public List<Review> getAllByProductId(@PathVariable Long id){
        return reviewService.getAllByProductId(id);
    }

    @GetMapping("/rv/getAllByUserId/{id}")
    public List<Review> getAllByUserId(@PathVariable Long id){
        return reviewService.getAllByUserId(id);
    }

}

