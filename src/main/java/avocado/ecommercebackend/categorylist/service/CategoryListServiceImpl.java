package avocado.ecommercebackend.categorylist.service;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.categorylist.model.CategoryList;
import avocado.ecommercebackend.categorylist.repository.CategoryListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryListServiceImpl implements CategoryListService {


    @Autowired
    private CategoryListRepository categoryListRepository;

    @Override
    public CategoryList addCategoryList(CategoryList categoryList) {
        return categoryListRepository.save(categoryList);
    }

    @Override
    public List<CategoryList> getAllCategoryList() {
        return categoryListRepository.findAll();
    }

    @Override
    public Optional<CategoryList> getCategoryList(Long id) {
        return Optional.ofNullable(categoryListRepository.findById(id)).get();
    }
}
