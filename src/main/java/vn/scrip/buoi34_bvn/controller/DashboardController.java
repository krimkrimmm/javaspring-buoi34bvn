package vn.scrip.buoi34_bvn.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SALE')")
    public String viewDashboard() {
        return "Dashboard for ADMIN and SALE";
    }
}






