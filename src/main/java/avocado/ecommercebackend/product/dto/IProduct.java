package avocado.ecommercebackend.product.dto;


import lombok.Data;

@Data
public class IProduct {

    private Long id;
    private Long productName;
    private Long stockQuantity;
    private Long price;
}
