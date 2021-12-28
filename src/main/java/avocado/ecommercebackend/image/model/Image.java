package avocado.ecommercebackend.image.model;

import avocado.ecommercebackend.product.model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Builder
    public Image(String imageUrl, Product product) {
        this.imageUrl = imageUrl;
        this.product = product;
    }
}
