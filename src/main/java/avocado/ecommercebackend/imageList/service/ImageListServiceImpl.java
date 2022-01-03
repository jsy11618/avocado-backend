package avocado.ecommercebackend.imageList.service;

import avocado.ecommercebackend.image.repository.ImageRepository;
import avocado.ecommercebackend.imageList.model.ImageList;
import avocado.ecommercebackend.imageList.repository.ImageListRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ImageListServiceImpl implements ImageListService {


    @Autowired
    private ImageListRepository imageListRepository;

    @Override
    public ImageList addImageList(ImageList imageList) {
        log.info("{}",imageList);


        return imageListRepository.save(imageList);
    }

    @Override
    public List<ImageList> getAllImageList() {
        log.info("ImageList get in the ImageList");
        return imageListRepository.findAll();

    }

    @Override
    public Optional<ImageList> getImageList(Long id) {

        log.info("ImageList get in the ImageList");
        return Optional.ofNullable(imageListRepository.findById(id)).get();
    }
}
