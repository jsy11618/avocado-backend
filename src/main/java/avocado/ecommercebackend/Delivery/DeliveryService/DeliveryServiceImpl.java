package avocado.ecommercebackend.Delivery.DeliveryService;

import avocado.ecommercebackend.Delivery.DeliveryModel.DeliveryModel;
import avocado.ecommercebackend.Delivery.DeliveryRepository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;




//@Autowired
//private CommentRepository commentRepository;
//
//@Override
//public Comment addComment(Comment comment) {
//        return commentRepository.save(comment);
//        }
//



public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;


    @Override
    public DeliveryModel addDelivery(DeliveryModel deliveryModel) {
        return deliveryRepository.save(deliveryModel);
    }


    @Override
    public List<DeliveryModel> getAllDelivery() {
        return deliveryRepository.findAll() ;
    }

    @Override
    public Optional<DeliveryModel> get(Long id) {
        return Optional.ofNullable(deliveryRepository.findById(id)).get();

    }
}
