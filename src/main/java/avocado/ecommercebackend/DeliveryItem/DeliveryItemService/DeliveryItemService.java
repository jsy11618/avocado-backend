package avocado.ecommercebackend.DeliveryItem.DeliveryItemService;

import avocado.ecommercebackend.Delivery.DeliveryModel.DeliveryModel;
import avocado.ecommercebackend.DeliveryItem.DeliveryItemModel.DeliveryItem;

import java.util.List;
import java.util.Optional;

public interface DeliveryItemService {
//    public interface DeliveryService {
//        DeliveryModel addDelivery(DeliveryModel deliveryModel);
//        List<DeliveryModel> getAllDelivery();
//        Optional<DeliveryModel> get(Long id);
//    }

    DeliveryItem addDeliveryItem(DeliveryItem deliveryItem);
    List<DeliveryItem> getAllDelivery();
    Optional<DeliveryItem> get(Long id);


}
