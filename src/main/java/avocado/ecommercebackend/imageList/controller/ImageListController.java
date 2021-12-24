package avocado.ecommercebackend.imageList.controller;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.image.service.ImageService;
import avocado.ecommercebackend.imageList.dto.IImageList;
import avocado.ecommercebackend.imageList.model.ImageList;
import avocado.ecommercebackend.imageList.service.ImageListService;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagelist")
public class ImageListController {

    @Autowired
    private ImageListService imageListService;
    @Autowired
    private ImageService imageService;
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ImageList add(@RequestBody IImageList iImageList){
        return imageListService.addImageList(
                new ImageList(
                        imageService.getImage(iImageList.getImageId()).get(),
                        productService.getProduct(iImageList.getProductImageId()).get()));
    }

    @GetMapping("/getall")
    public List<ImageList>getAllImageList(){
        return imageListService.getAllImageList();
    }
    @GetMapping("/getimage/{id}")
    public Image getImage(@PathVariable Long id){
        return imageService.getImage(id).get();
    }
    @GetMapping("/getimageproduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return  productService.getProduct(id).get();
    }
}
