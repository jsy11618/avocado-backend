package avocado.ecommercebackend.image.service;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.image.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;



    @Override
    public Image addImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public List<Image> getAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public Optional<Image> getImage(Long id) {
        return Optional.ofNullable(imageRepository.findById(id)).get();
    }
}
