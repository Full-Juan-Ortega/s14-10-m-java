package com.s1410.calme.Domain.Repositories;

import com.s1410.calme.Domain.Entities.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Query(value = "SELECT a FROM Appointment a where a.active = ?1",
            countQuery = "SELECT count(*) FROM Appointment a WHERE a.active = ?1")
    Page<Appointment> findAppointmentsByActivePageable(Boolean active, Pageable pageable);

    @Query(value = "SELECT a FROM Appointment  a where  a.active = ?1 AND a.date between ?2 AND ?3 ")
    Page<Appointment> findAppointmentsBetweenDates(Boolean active, LocalDateTime startDate, LocalDateTime finishDate,  Pageable pageable);

}
