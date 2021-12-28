package avocado.ecommercebackend.category.service;


import avocado.ecommercebackend.category.dto.CategoryDto;
import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Category addCategory(CategoryDto categoryDto);
    List<Category>getAllCategory();
    Optional<Category>getCategory(Long id);
    List<Product>getCategoryByProductById(Long id);




}
