package com.anurag.hospital_management.mapper;

import com.anurag.hospital_management.dto.request.PatientRequestDTO;
import com.anurag.hospital_management.dto.response.PatientResponseDTO;
import com.anurag.hospital_management.entity.Patient;

public class PatientMapper
{

    public static Patient toEntity(PatientRequestDTO dto)
    {
        return Patient.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .address(dto.getAddress())
                .build();
    }

    public static PatientResponseDTO toResponseDTO(Patient patient)
    {
        return PatientResponseDTO.builder()
                .id(patient.getId())
                .firstName(patient.getFirstName())
                .lastName(patient.getLastName())
                .age(patient.getAge())
                .gender(patient.getGender())
                .email(patient.getEmail())
                .phoneNumber(patient.getPhoneNumber())
                .address(patient.getAddress())
                .build();
    }

}