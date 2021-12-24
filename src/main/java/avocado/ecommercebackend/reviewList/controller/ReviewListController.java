package avocado.ecommercebackend.reviewList.controller;

import avocado.ecommercebackend.reviewList.dto.IReviewList;
import avocado.ecommercebackend.reviewList.model.ReviewList;
import avocado.ecommercebackend.reviewList.service.ReviewListService;
import avocado.ecommercebackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReviewListController {

        @Autowired
        private ReviewListService reviewListService;

        @Autowired
        private UserService userService;

//    @Autowired
//    private  ProductService productService;

        @PostMapping("/add")
        public ReviewList add(@RequestBody IReviewList iReviewList) {
            return reviewListService.addReviewList(
                    new ReviewList(
                            userService.getUser(iReviewList.getUserId()).get(),
                            productService.getProduct(iReviewList.getProductId()).get()
                    )
            );

        }

}


