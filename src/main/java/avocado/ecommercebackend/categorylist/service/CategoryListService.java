package avocado.ecommercebackend.categorylist.service;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.categorylist.model.CategoryList;

import java.util.List;
import java.util.Optional;

public interface CategoryListService {

    CategoryList addCategoryList(CategoryList categoryList);
    List<CategoryList> getAllCategoryList();
    Optional<CategoryList> getCategoryList(Long id);

}
