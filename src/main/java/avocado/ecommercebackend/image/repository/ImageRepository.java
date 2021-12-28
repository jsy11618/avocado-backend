package avocado.ecommercebackend.image.repository;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Product> findAllByProductId(Long id);
}
