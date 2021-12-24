package avocado.ecommercebackend.reviewList.service;

import avocado.ecommercebackend.reviewList.model.ReviewList;
import avocado.ecommercebackend.reviewList.repository.ReviewListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewListServiceImpl implements ReviewListService{

    @Autowired
    private ReviewListRepository reviewListRepository;

    @Override
    public ReviewList addReviewList(ReviewList reviewList) {
        return null;
    }

    @Override
    public List<ReviewList> getAllReviewList() {
        return null;
    }

    @Override
    public Optional<ReviewList> getReviewList(Long id) {
        return Optional.empty();
    }
}



