package com.s1410.calme.Domain.Dtos.response;

import com.s1410.calme.Domain.Entities.Appointment;
import com.s1410.calme.Domain.Entities.Assisted;
import com.s1410.calme.Domain.Entities.Assistent;
import com.s1410.calme.Domain.Entities.Doctor;

import java.time.LocalDateTime;

public record ResponseAppointment(
        Long id,
        Doctor doctor,
        Assistent assistent,
        Assisted assisted,
        LocalDateTime date,
        Boolean active
) {
}
