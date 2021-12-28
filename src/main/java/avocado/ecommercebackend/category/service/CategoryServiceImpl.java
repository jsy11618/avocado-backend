package avocado.ecommercebackend.category.service;

import avocado.ecommercebackend.category.dto.CategoryDto;
import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.category.repository.CategoryRepository;
import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final ProductService productService;

    @Override
    public Category addCategory(CategoryDto categoryDto) {
        return categoryRepository.save(
                Category.builder()
                        .categoryName(categoryDto.getCategoryName())
                        .type(categoryDto.getType())
                        .product(productService.getProductById(categoryDto.getProductId()).get())
                        .build()
        );
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategory(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id)).get();
    }

    @Override
    public List<Product> getCategoryByProductById(Long id) {
        return categoryRepository.findAllByProductId(id);
    }
}
