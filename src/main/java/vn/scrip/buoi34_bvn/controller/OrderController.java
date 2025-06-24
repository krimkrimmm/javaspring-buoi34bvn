package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String listOrders() {
        return "List orders";
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String createOrder() {
        return "Create order";
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String updateOrder(@PathVariable Long id) {
        return "Update order " + id;
    }
}
