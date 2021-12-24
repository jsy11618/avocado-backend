package avocado.ecommercebackend.category.controller;


import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public Category add(Category category){
        return categoryService.addCategory(category);
    }
    @GetMapping("/getall")
    public List<Category>getAllCategory(){
        return categoryService.getAllCategory();
    }
    public Category get(@PathVariable Long id){
        return categoryService.getCategory(id).get();
    }

}
