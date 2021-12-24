package avocado.ecommercebackend.category.service;


import avocado.ecommercebackend.category.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Category addCategory(Category category);
    List<Category>getAllCategory();
    Optional<Category>getCategory(Long id);




}
