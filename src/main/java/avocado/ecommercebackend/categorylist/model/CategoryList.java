package avocado.ecommercebackend.categorylist.model;


import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.product.model.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class CategoryList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product getProduct() {
        return product;
    }

    public Category getCategory() {
        return category;
    }

    public CategoryList(Product product, Category category) {
        this.product = product;
        this.category = category;
    }
}
