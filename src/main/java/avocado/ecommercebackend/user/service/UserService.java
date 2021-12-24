package avocado.ecommercebackend.user.service;

import avocado.ecommercebackend.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(User user);

    List<User> getAllUser();

    Optional<User> getUser(Long id);
}
