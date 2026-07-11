package com.anurag.hospital_management.mapper;

import com.anurag.hospital_management.dto.request.DoctorRequestDTO;
import com.anurag.hospital_management.dto.response.DoctorResponseDTO;
import com.anurag.hospital_management.entity.Doctor;

public class DoctorMapper
{

    public static Doctor toEntity(DoctorRequestDTO dto)
    {
        return Doctor.builder()
                .name(dto.getName())
                .specialization(dto.getSpecialization())
                .experience(dto.getExperience())
                .salary(dto.getSalary())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .build();
    }

    public static DoctorResponseDTO toResponseDTO(Doctor doctor)
    {
        return DoctorResponseDTO.builder()
                .id(doctor.getId())
                .name(doctor.getName())
                .specialization(doctor.getSpecialization())
                .experience(doctor.getExperience())
                .salary(doctor.getSalary())
                .email(doctor.getEmail())
                .phoneNumber(doctor.getPhoneNumber())
                .build();
    }

}