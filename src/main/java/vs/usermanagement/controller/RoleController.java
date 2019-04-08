package vs.usermanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vs.usermanagement.service.RoleService;

/**
 * RoleController
 */
@RestController
@RequestMapping("role")
public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(roleService.findAll());
    }

}