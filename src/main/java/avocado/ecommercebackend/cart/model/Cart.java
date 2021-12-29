package avocado.ecommercebackend.cart.model;

import avocado.ecommercebackend.cartProduct.model.CartProduct;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @OneToMany(mappedBy = "cart")
    private List<CartProduct> cartList = new ArrayList<CartProduct>();

    public List<CartProduct> getCartList() {
        return cartList;
    }

    public void addProduct(CartProduct cartProduct) {
        System.out.println(cartProduct.toString());
        cartList.add(cartProduct);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                '}';
    }
}
