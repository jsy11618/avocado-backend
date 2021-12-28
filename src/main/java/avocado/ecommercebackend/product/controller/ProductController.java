package avocado.ecommercebackend.product.controller;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/get/{id}")
    public Product get(@PathVariable Long id) {
        return productService.getProduct(id).get();
    }

}
