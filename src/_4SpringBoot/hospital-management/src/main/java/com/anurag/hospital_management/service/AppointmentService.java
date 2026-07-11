package com.anurag.hospital_management.service;

import com.anurag.hospital_management.dto.request.AppointmentRequestDTO;
import com.anurag.hospital_management.dto.response.AppointmentResponseDTO;

import java.util.List;

public interface AppointmentService
{

    AppointmentResponseDTO saveAppointment(AppointmentRequestDTO requestDTO);

    List<AppointmentResponseDTO> getAllAppointments();

    AppointmentResponseDTO getAppointmentById(Long id);

    AppointmentResponseDTO updateAppointment(Long id, AppointmentRequestDTO requestDTO);

    void deleteAppointment(Long id);

}