package com.santicodev.springessentialtraining.business.services;

import com.santicodev.springessentialtraining.data.Position;
import com.santicodev.springessentialtraining.data.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jhon", "Doe", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "jane", "Peper", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Atom", Position.HOUSEKEEPING));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Sammy", "Haggar", Position.SECURITY));
    }

    public static List<StaffMember> getAllStaff() {
        return staff;
    }
}
