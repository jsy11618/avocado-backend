package avocado.ecommercebackend.cart.repository;

import avocado.ecommercebackend.cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
