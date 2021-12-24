package busanprojectday2.avocadoday2.reviewList.service;

import busanprojectday2.avocadoday2.reviewList.model.ReviewList;

import java.util.List;
import java.util.Optional;

public interface ReviewListService {
    ReviewList addReviewList(ReviewList reviewList);
    List<ReviewList>getAllReviewList();
    Optional<ReviewList>getReviewList(Long id);

}
