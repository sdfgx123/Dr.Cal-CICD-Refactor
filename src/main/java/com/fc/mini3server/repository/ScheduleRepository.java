package com.fc.mini3server.repository;

import com.fc.mini3server.domain.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    Page<Schedule> findScheduleByOrderById(Pageable pageable);
}
