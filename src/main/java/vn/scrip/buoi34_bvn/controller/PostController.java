package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE', 'AUTHOR')")
    public String listPosts() {
        return "List posts";
    }
    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE', 'AUTHOR')")
    public String createPost() {
        return "Create post";
    }
    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE', 'AUTHOR')")
    public String updatePost(@PathVariable Long id) {
        return "Update post " + id;
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE', 'AUTHOR')")
    public String deletePost(@PathVariable Long id) {
        return "Delete post " + id;
    }
}
