package avocado.ecommercebackend.Delivery.DeliveryRepository;

import avocado.ecommercebackend.Delivery.DeliveryModel.DeliveryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryModel, Long> {

}
