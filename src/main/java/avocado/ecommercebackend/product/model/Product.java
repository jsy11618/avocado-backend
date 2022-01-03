package avocado.ecommercebackend.product.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int stockQuantity;
    private int price;
    private int sale;
    private int rate;
    private String productDetail;
    private Boolean isSlide;
    private Boolean isTrend;
    private Boolean isBest;
    private Boolean isTodayDeal;
    private Boolean isAlmostSold;


    public Product() {
    }

    @Builder

    public Product(String productName, int stockQuantity, int price, int sale, int rate, String productDetail, Boolean isSlide, Boolean isTrend, Boolean isBest, Boolean isTodayDeal, Boolean isAlmostSold) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.sale = sale;
        this.rate = rate;
        this.productDetail = productDetail;
        this.isSlide = isSlide;
        this.isTrend = isTrend;
        this.isBest = isBest;
        this.isTodayDeal = isTodayDeal;
        this.isAlmostSold = isAlmostSold;
    }

}
