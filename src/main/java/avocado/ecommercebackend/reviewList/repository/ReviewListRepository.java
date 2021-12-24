package avocado.ecommercebackend.reviewList.repository;

import avocado.ecommercebackend.reviewList.model.ReviewList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewListRepository extends JpaRepository<ReviewList, Long> {
}
