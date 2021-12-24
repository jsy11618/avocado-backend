package busanprojectday2.avocadoday2.users.service;

import busanprojectday2.avocadoday2.users.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(User user);

    List<User> getAllUser();

    Optional<User> getUser(Long id);
}
