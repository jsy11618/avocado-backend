package avocado.ecommercebackend.product.repository;

import avocado.ecommercebackend.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
