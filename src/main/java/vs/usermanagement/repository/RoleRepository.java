package vs.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vs.usermanagement.entities.Role;

/**
 * RoleRepository
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}