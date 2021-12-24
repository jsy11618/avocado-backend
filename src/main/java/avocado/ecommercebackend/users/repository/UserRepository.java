package busanprojectday2.avocadoday2.users.repository;

import busanprojectday2.avocadoday2.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
