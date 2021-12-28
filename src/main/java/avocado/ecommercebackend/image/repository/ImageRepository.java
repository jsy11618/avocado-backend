package avocado.ecommercebackend.image.repository;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
<<<<<<< HEAD
    List<Product> findAllByProductId(Long id);
=======
    List<Image> findAllByProductId(Long id);
>>>>>>> 437ce0f490dea5db578f0b80e4f2cf514e4a4bc8
}
