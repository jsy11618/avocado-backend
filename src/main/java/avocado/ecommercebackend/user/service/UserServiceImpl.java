package avocado.ecommercebackend.user.service;

import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User addUser(User user) {
        log.info("새로운 유저를 데이터베이스에 저장했습니다.: {}", user.getUserName());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        log.info("모든 유저를 리스트로 불러왔습니다.");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        log.info("해당 유저를 찾았습니다. : {}", id);
        return Optional.ofNullable(userRepository.findById(id)).get();
    }
}

