package avocado.ecommercebackend.image.repository;

import avocado.ecommercebackend.image.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
