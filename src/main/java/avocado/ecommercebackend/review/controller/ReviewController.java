package busanprojectday2.avocadoday2.review.controller;

import busanprojectday2.avocadoday2.review.dto.IReview;
import busanprojectday2.avocadoday2.review.model.Review;
import busanprojectday2.avocadoday2.review.service.ReviewService;
import busanprojectday2.avocadoday2.users.service.UserService;
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
    public List<Review>getAllReview(){return reviewService.getAllReview();}


}
