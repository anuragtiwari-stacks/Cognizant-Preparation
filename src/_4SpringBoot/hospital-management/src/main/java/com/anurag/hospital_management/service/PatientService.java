package com.anurag.hospital_management.service;

import com.anurag.hospital_management.dto.request.PatientRequestDTO;
import com.anurag.hospital_management.dto.response.PatientResponseDTO;

import java.util.List;

public interface PatientService
{

    PatientResponseDTO savePatient(PatientRequestDTO requestDTO);

    List<PatientResponseDTO> getAllPatients();

    PatientResponseDTO getPatientById(Long id);

    PatientResponseDTO updatePatient(Long id, PatientRequestDTO requestDTO);

    void deletePatient(Long id);

}