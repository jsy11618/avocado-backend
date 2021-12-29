package avocado.ecommercebackend.wishProduct.repository;

import avocado.ecommercebackend.wishProduct.model.WishProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishProductRepository extends JpaRepository<WishProduct, Long> {
    List<WishProduct> findAllByWishId(Long id);
}
