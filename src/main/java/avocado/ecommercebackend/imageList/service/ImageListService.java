package avocado.ecommercebackend.imageList.service;

import avocado.ecommercebackend.imageList.model.ImageList;

import java.util.List;
import java.util.Optional;

public interface ImageListService {

    ImageList addImageList(ImageList imageList);
    List<ImageList>getAllImageList();
    Optional<ImageList>getImageList(Long id);
}
