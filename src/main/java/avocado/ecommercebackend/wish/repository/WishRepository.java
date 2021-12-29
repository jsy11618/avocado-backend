package avocado.ecommercebackend.wish.repository;

import avocado.ecommercebackend.wish.model.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository extends JpaRepository<Wish, Long> {
}
