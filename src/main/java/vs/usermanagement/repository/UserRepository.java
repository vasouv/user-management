package vs.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vs.usermanagement.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
