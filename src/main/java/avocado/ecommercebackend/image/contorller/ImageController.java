package avocado.ecommercebackend.image.contorller;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping("/add")
    public Image add(@RequestBody Image image){
        return imageService.addImage(image);
    }
    @GetMapping("/getall")
    public List<Image>getAllImage(){
        return imageService.getAllImage();
    }

    public Image get(@PathVariable Long id){
        return imageService.getImage(id).get();
    }
}
