package avocado.ecommercebackend.review.controller;

import avocado.ecommercebackend.review.dto.IReview;
import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.service.ReviewService;
import avocado.ecommercebackend.reviewList.dto.IReviewList;
import avocado.ecommercebackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReviewController {
    @RestController
    @RequestMapping("/review")
    public class ReviewController {

        @Autowired
        private ReviewService reviewService;

        @Autowired
        private UserService userService;

        //이거 product 있으면 연결되도록!
//    @Autowired
//    private ProductService productService;


        @PostMapping("/add")
        public Review add(@RequestBody IReview iReview){
            return reviewService.addReview(
                    new Review(
                            userService.getUser(iReview.getUserId()).get(),
                            productService.getProduct(iReview.getUserId()).get()
                    )
            );
        }

        @GetMapping("/getAll")
        public List<Review> getAllReview(){return reviewService.getAllReview();}


    }
}
