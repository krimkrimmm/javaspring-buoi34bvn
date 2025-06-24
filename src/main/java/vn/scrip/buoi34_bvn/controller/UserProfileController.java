package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/me")
public class UserProfileController {

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String getProfile() {
        return "Your personal profile info";
    }

    @PutMapping
    @PreAuthorize("hasRole('USER')")
    public String updateProfile() {
        return "Update your personal info";
    }
}
