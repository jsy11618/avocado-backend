package avocado.ecommercebackend.product.dto;


import lombok.Data;

@Data
public class IProduct {

    private Long id;
    private String productName;
    private int stockQuantity;
    private int price;
}
