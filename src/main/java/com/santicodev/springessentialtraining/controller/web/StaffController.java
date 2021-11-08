package com.santicodev.springessentialtraining.controller.web;

import com.santicodev.springessentialtraining.business.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staffService.getAllStaffMembers());
        return "staff";
    }
}
