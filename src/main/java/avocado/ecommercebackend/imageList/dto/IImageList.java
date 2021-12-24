package avocado.ecommercebackend.imageList.dto;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;
import lombok.Data;

@Data
public class IImageList {

    private Long id;
    private Long imageId;
    private Long productImageId;
}
