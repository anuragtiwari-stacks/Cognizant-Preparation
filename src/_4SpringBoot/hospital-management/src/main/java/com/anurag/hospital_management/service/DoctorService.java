package com.anurag.hospital_management.service;

import com.anurag.hospital_management.dto.request.DoctorRequestDTO;
import com.anurag.hospital_management.dto.response.DoctorResponseDTO;

import java.util.List;

public interface DoctorService
{

    DoctorResponseDTO saveDoctor(DoctorRequestDTO requestDTO);

    List<DoctorResponseDTO> getAllDoctors();

    DoctorResponseDTO getDoctorById(Long id);

    DoctorResponseDTO updateDoctor(Long id, DoctorRequestDTO requestDTO);

    void deleteDoctor(Long id);

}