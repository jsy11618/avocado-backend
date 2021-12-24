package avocado.ecommercebackend.image.service;

import avocado.ecommercebackend.image.model.Image;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image addImage(Image image);
    List<Image>getAllImage();
    Optional<Image>getImage(Long id);
}
