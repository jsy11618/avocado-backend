package avocado.ecommercebackend.categorylist.controller;


import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.service.CategoryService;
import avocado.ecommercebackend.categorylist.dto.ICategoryList;
import avocado.ecommercebackend.categorylist.model.CategoryList;
import avocado.ecommercebackend.categorylist.service.CategoryListService;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorylist")
public class CategoryListController {


    @Autowired
    private CategoryListService categoryListService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public CategoryList add(@RequestBody ICategoryList iCategoryList){
        return categoryListService.addCategoryList(
                new CategoryList(
                        productService.getProduct(iCategoryList.getProductCategoryId()).get(),
                        categoryService.getCategory(iCategoryList.getCategoryId()).get()
        ));

    }
    @GetMapping("/getall")
    public List<CategoryList>getAllCategoryList(){
        return categoryListService.getAllCategoryList();
    }
    @GetMapping("/getcategory/{id}")
    public Category getCategory(@PathVariable Long id){
        return categoryService.getCategory(id).get();
    }
    @GetMapping("/getproduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id).get();
    }
}
