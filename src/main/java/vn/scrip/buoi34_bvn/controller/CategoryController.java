package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String listCategories() {
        return "List categories";
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String createCategory() {
        return "Create category";
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String updateCategory(@PathVariable Long id) {
        return "Update category " + id;
    }



    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String deleteCategory(@PathVariable Long id) {
        return "Delete category " + id;
    }
}






