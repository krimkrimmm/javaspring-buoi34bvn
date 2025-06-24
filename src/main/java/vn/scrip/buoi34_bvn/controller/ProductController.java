package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/products")
public class ProductController
{
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String listProducts() {
        return "List products";
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String createProduct() {
        return "Create product";
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String updateProduct(@PathVariable Long id) {
        return "Update product " + id;
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String deleteProduct(@PathVariable Long id) {
        return "Delete product " + id;
    }
}
