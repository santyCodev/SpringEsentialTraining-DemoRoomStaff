package com.santicodev.springessentialtraining.data.repository;

import com.santicodev.springessentialtraining.data.entity.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMemberRepository extends JpaRepository<StaffMember, Long> {
}
