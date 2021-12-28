package avocado.ecommercebackend.image.service;

import avocado.ecommercebackend.image.dto.IImage;
import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.image.repository.ImageRepository;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ImageServiceImpl implements ImageService {


    private final ImageRepository imageRepository;
    private final ProductService productService;


    @Override
    public Image addImage(IImage iImage) {
        return imageRepository.save(
                Image.builder()
                        .imageUrl(iImage.getImageUrl())
                        .product(productService.getProductById(iImage.getProductId()).get())
                        .build()
          );
    }

    @Override
    public List<Image> getAllImage() {
        return imageRepository.findAll();
    }

    @Override
    public Optional<Image> getImage(Long id) {
        return Optional.ofNullable(imageRepository.findById(id)).get();
    }

    @Override
    public List<Product> getCategoryByProductById(Long id) {
        return imageRepository.findAllByProductId(id);
    }
}
