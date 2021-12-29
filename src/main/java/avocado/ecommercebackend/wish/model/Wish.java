package avocado.ecommercebackend.wish.model;

import avocado.ecommercebackend.product.model.Product;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
