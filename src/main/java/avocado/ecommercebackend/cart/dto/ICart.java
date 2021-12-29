package avocado.ecommercebackend.cart.dto;

import lombok.Data;

@Data
public class ICart {
    private Long id;
    private Long productId;
    private int quantity;
}
