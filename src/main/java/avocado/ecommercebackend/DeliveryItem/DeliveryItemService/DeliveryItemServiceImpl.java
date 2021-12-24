package avocado.ecommercebackend.DeliveryItem.DeliveryItemService;

import avocado.ecommercebackend.Delivery.DeliveryModel.DeliveryModel;
import avocado.ecommercebackend.Delivery.DeliveryRepository.DeliveryRepository;
import avocado.ecommercebackend.DeliveryItem.DeliveryItemModel.DeliveryItem;
import avocado.ecommercebackend.DeliveryItem.DeliveryItemRepository.DeliveryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DeliveryItemServiceImpl implements DeliveryItemService{
//    @Autowired
//    private DeliveryRepository deliveryRepository;
//
//
//    @Override
//    public DeliveryModel addDelivery(DeliveryModel deliveryModel) {
//        return deliveryRepository.save(deliveryModel);
//    }
//
//
//    @Override
//    public List<DeliveryModel> getAllDelivery() {
//        return deliveryRepository.findAll() ;
//    }
//
//    @Override
//    public Optional<DeliveryModel> get(Long id) {
//        return Optional.ofNullable(deliveryRepository.findById(id)).get();

    @Autowired
    private DeliveryItemRepository deliveryItemRepository;

    @Override
    public DeliveryItem addDeliveryItem(DeliveryItem deliveryItem) {
        return  deliveryItemRepository.save(deliveryItem);
    }

    @Override
    public List<DeliveryItem> getAllDelivery() {
        return deliveryItemRepository.findAll();
    }

    @Override
    public Optional<DeliveryItem> get(Long id) {
        return Optional.ofNullable(deliveryItemRepository.findById(id)).get();
    }
}
