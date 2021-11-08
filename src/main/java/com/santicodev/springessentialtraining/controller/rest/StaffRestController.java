package com.santicodev.springessentialtraining.controller.rest;

import com.santicodev.springessentialtraining.business.services.StaffService;
import com.santicodev.springessentialtraining.data.entity.StaffMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    @Autowired
    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff() {
        return staffService.getAllStaffMembers();
    }
}
