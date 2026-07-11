package com.anurag.hospital_management.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentResponseDTO
{

    private Long id;

    private LocalDate appointmentDate;

    private LocalTime appointmentTime;

    private String status;

    private Long patientId;

    private String patientName;

    private Long doctorId;

    private String doctorName;

}