package avocado.ecommercebackend.Delivery.DeliveryModel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class DeliveryModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long products_Id;
}
