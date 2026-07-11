package com.anurag.hospital_management.service.impl;

import com.anurag.hospital_management.dto.request.DoctorRequestDTO;
import com.anurag.hospital_management.dto.response.DoctorResponseDTO;
import com.anurag.hospital_management.entity.Doctor;
import com.anurag.hospital_management.exception.ResourceNotFoundException;
import com.anurag.hospital_management.mapper.DoctorMapper;
import com.anurag.hospital_management.repository.DoctorRepository;
import com.anurag.hospital_management.service.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class DoctorServiceImpl implements DoctorService
{

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository)
    {
        this.doctorRepository = doctorRepository;
    }

    @Override
    @Transactional
    public DoctorResponseDTO saveDoctor(DoctorRequestDTO requestDTO)
    {
        Doctor doctor = DoctorMapper.toEntity(requestDTO);

        Doctor savedDoctor = doctorRepository.save(doctor);

        return DoctorMapper.toResponseDTO(savedDoctor);
    }

    @Override
    public List<DoctorResponseDTO> getAllDoctors()
    {
        return doctorRepository.findAll()
                .stream()
                .map(DoctorMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorResponseDTO getDoctorById(Long id)
    {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Doctor not found with id : " + id));

        return DoctorMapper.toResponseDTO(doctor);
    }

    @Override
    @Transactional
    public DoctorResponseDTO updateDoctor(Long id, DoctorRequestDTO requestDTO)
    {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Doctor not found with id : " + id));

        doctor.setName(requestDTO.getName());
        doctor.setSpecialization(requestDTO.getSpecialization());
        doctor.setExperience(requestDTO.getExperience());
        doctor.setSalary(requestDTO.getSalary());
        doctor.setEmail(requestDTO.getEmail());
        doctor.setPhoneNumber(requestDTO.getPhoneNumber());

        Doctor updatedDoctor = doctorRepository.save(doctor);

        return DoctorMapper.toResponseDTO(updatedDoctor);
    }

    @Override
    @Transactional
    public void deleteDoctor(Long id)
    {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Doctor not found with id : " + id));

        doctorRepository.delete(doctor);
    }

}