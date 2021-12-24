package avocado.ecommercebackend.imageList.service;

import avocado.ecommercebackend.image.repository.ImageRepository;
import avocado.ecommercebackend.imageList.model.ImageList;
import avocado.ecommercebackend.imageList.repository.ImageListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageListServiceImpl implements ImageListService {

    @Autowired
    private ImageListRepository imageListRepository;

    @Override
    public ImageList addImageList(ImageList imageList) {
        return imageListRepository.save(imageList);
    }

    @Override
    public List<ImageList> getAllImageList() {
        return imageListRepository.findAll();
    }

    @Override
    public Optional<ImageList> getImageList(Long id) {
        return Optional.ofNullable(imageListRepository.findById(id)).get();
    }
}
