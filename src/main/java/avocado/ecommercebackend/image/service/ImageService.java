package avocado.ecommercebackend.image.service;

import avocado.ecommercebackend.image.dto.IImage;
import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    Image addImage(IImage iImage);
    List<Image>getAllImage();
    Optional<Image>getImage(Long id);
<<<<<<< HEAD
    List<Product>getCategoryByProductById(Long id);
=======
    List<Image>getImageByProductById(Long id);
>>>>>>> 437ce0f490dea5db578f0b80e4f2cf514e4a4bc8
}
