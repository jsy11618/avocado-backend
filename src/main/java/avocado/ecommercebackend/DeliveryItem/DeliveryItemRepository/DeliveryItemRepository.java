package avocado.ecommercebackend.DeliveryItem.DeliveryItemRepository;

import avocado.ecommercebackend.DeliveryItem.DeliveryItemModel.DeliveryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryItemRepository extends JpaRepository<DeliveryItem,Long> {

}
