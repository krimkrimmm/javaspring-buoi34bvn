package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String listUsers() {
        return "List of users (ADMIN)";
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String createUser() {
        return "Create user (ADMIN)";
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String updateUser(@PathVariable Long id) {
        return "Update user " + id + " (ADMIN)";
    }
}
