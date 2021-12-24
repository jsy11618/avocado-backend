package busanprojectday2.avocadoday2.users.service;

import busanprojectday2.avocadoday2.users.model.User;
import busanprojectday2.avocadoday2.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        return Optional.ofNullable(userRepository.findById(id)).get();
    }
}
