package avocado.ecommercebackend.cartProduct.repository;

import avocado.ecommercebackend.cartProduct.model.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
    List<CartProduct> findAllByCartId(Long id);
}
