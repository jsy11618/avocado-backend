package avocado.ecommercebackend.product.controller;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProductController {

    @Autowired
    private ProductService productService;

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
