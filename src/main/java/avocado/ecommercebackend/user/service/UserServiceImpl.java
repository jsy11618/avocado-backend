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


    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        log.info("새로운 회원 추가했습니다.: {}", user.getUserName());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        log.info("전체 회원목록을 불러왔습니다.");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        log.info("아이디로 해당회원을 찾아왔습니다.");
        return Optional.ofNullable(userRepository.findById(id)).get();
    }
}

