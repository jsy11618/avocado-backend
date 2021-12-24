package avocado.ecommercebackend.imageList.repository;

import avocado.ecommercebackend.imageList.model.ImageList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageListRepository extends JpaRepository<ImageList, Long> {
}
