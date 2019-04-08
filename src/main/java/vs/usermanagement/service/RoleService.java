package vs.usermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vs.usermanagement.entities.Role;
import vs.usermanagement.repository.RoleRepository;

/**
 * RoleService
 */
@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

}