package avocado.ecommercebackend.categorylist.dto;

import avocado.ecommercebackend.category.model.Category;
import avocado.ecommercebackend.product.model.Product;
import lombok.Data;

@Data
public class ICategoryList {

    private Long id;
    private Long productCategoryId;
    private Long categoryId;

}
