package avocado.ecommercebackend.review.controller;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import avocado.ecommercebackend.review.dto.IReview;
import avocado.ecommercebackend.review.model.Review;
import avocado.ecommercebackend.review.service.ReviewService;
import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/review")
    public class ReviewController {

        @Autowired
        private ReviewService reviewService;

        @Autowired
        private UserService userService;

        @Autowired
        private ProductService productService;

        @PostMapping("/add")
        public Review add(@RequestBody IReview iReview){
            Product product = productService.getProductById(iReview.getProductId()).get();
            User user = userService.getUser(iReview.getUserId()).get();
            return reviewService.addReview(new Review(iReview.getText(), user,product));
        }

        @GetMapping("/getAll")
        public List<Review> getAllReview(){return reviewService.getAllReview();}



}
