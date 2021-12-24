package avocado.ecommercebackend.imageList.model;

import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;

import javax.persistence.*;


@Entity
public class ImageList {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productImage;

    public ImageList() {
    }

    public Image getImage() {
        return image;
    }

    public Product getProduct() {
        return productImage;
    }

    public ImageList(Image image, Product product) {
        this.image = image;
        this.productImage = product;
    }
}
