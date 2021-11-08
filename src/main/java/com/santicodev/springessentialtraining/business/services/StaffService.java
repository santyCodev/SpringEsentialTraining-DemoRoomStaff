package com.santicodev.springessentialtraining.business.services;

import com.santicodev.springessentialtraining.data.entity.StaffMember;
import com.santicodev.springessentialtraining.data.repository.StaffMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffMemberRepository staffMemberRepository;

    public StaffService(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    public List<StaffMember> getAllStaffMembers() {
        return staffMemberRepository.findAll();
    }
}
