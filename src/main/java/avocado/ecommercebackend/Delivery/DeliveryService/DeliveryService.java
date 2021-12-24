package avocado.ecommercebackend.Delivery.DeliveryService;

import avocado.ecommercebackend.Delivery.DeliveryModel.DeliveryModel;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    DeliveryModel addDelivery(DeliveryModel deliveryModel);
     List<DeliveryModel> getAllDelivery();
    Optional<DeliveryModel> get(Long id);
}



