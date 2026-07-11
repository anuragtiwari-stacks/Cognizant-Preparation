package com.anurag.hospital_management.service.impl;

import com.anurag.hospital_management.dto.request.PatientRequestDTO;
import com.anurag.hospital_management.dto.response.PatientResponseDTO;
import com.anurag.hospital_management.entity.Patient;
import com.anurag.hospital_management.exception.ResourceNotFoundException;
import com.anurag.hospital_management.mapper.PatientMapper;
import com.anurag.hospital_management.repository.PatientRepository;
import com.anurag.hospital_management.service.PatientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class PatientServiceImpl implements PatientService
{

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository)
    {
        this.patientRepository = patientRepository;
    }

    @Override
    @Transactional
    public PatientResponseDTO savePatient(PatientRequestDTO requestDTO)
    {
        Patient patient = PatientMapper.toEntity(requestDTO);

        Patient savedPatient = patientRepository.save(patient);

        return PatientMapper.toResponseDTO(savedPatient);
    }

    @Override
    public List<PatientResponseDTO> getAllPatients()
    {
        return patientRepository.findAll()
                .stream()
                .map(PatientMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PatientResponseDTO getPatientById(Long id)
    {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Patient not found with id : " + id));

        return PatientMapper.toResponseDTO(patient);
    }

    @Override
    @Transactional
    public PatientResponseDTO updatePatient(Long id, PatientRequestDTO requestDTO)
    {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Patient not found with id : " + id));

        patient.setFirstName(requestDTO.getFirstName());
        patient.setLastName(requestDTO.getLastName());
        patient.setAge(requestDTO.getAge());
        patient.setGender(requestDTO.getGender());
        patient.setEmail(requestDTO.getEmail());
        patient.setPhoneNumber(requestDTO.getPhoneNumber());
        patient.setAddress(requestDTO.getAddress());

        Patient updatedPatient = patientRepository.save(patient);

        return PatientMapper.toResponseDTO(updatedPatient);
    }

    @Override
    @Transactional
    public void deletePatient(Long id)
    {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Patient not found with id : " + id));

        patientRepository.delete(patient);
    }

}