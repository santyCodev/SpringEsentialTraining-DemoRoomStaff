package com.santicodev.springessentialtraining.data.repository;

import com.santicodev.springessentialtraining.data.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
