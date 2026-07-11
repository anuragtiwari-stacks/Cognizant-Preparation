package com.anurag.hospital_management.mapper;

import com.anurag.hospital_management.dto.response.AppointmentResponseDTO;
import com.anurag.hospital_management.entity.Appointment;

public class AppointmentMapper
{

    public static AppointmentResponseDTO toResponseDTO(Appointment appointment)
    {
        return AppointmentResponseDTO.builder()
                .id(appointment.getId())
                .appointmentDate(appointment.getAppointmentDate())
                .appointmentTime(appointment.getAppointmentTime())
                .status(appointment.getStatus())
                .patientId(appointment.getPatient().getId())
                .patientName(
                        appointment.getPatient().getFirstName() + " " +
                                appointment.getPatient().getLastName()
                )
                .doctorId(appointment.getDoctor().getId())
                .doctorName(appointment.getDoctor().getName())
                .build();
    }

}