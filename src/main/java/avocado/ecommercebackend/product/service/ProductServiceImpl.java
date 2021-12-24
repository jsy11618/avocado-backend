package avocado.ecommercebackend.product.service;

import avocado.ecommercebackend.product.model.Product;
import avocado.ecommercebackend.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService{

    @Autowired
        private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return Optional.ofNullable(productRepository.findById(id)).get();
    }
}
