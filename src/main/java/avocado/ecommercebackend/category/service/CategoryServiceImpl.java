package avocado.ecommercebackend.category.service;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategory(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id)).get();
    }
}
