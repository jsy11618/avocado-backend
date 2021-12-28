package avocado.ecommercebackend.category.dto;

import lombok.Data;

@Data
public class CategoryDto {
    private int type;
    private String categoryName;
    private Long productId;
}
