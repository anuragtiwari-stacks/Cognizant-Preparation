package com.anurag.hospital_management.service.impl;

import com.anurag.hospital_management.dto.request.AppointmentRequestDTO;
import com.anurag.hospital_management.dto.response.AppointmentResponseDTO;
import com.anurag.hospital_management.entity.Appointment;
import com.anurag.hospital_management.entity.Doctor;
import com.anurag.hospital_management.entity.Patient;
import com.anurag.hospital_management.exception.ResourceNotFoundException;
import com.anurag.hospital_management.mapper.AppointmentMapper;
import com.anurag.hospital_management.repository.AppointmentRepository;
import com.anurag.hospital_management.repository.DoctorRepository;
import com.anurag.hospital_management.repository.PatientRepository;
import com.anurag.hospital_management.service.AppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class AppointmentServiceImpl implements AppointmentService
{

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public AppointmentServiceImpl(
            AppointmentRepository appointmentRepository,
            PatientRepository patientRepository,
            DoctorRepository doctorRepository)
    {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    @Override
    @Transactional
    public AppointmentResponseDTO saveAppointment(AppointmentRequestDTO requestDTO)
    {

        Patient patient = patientRepository.findById(requestDTO.getPatientId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Patient not found with id : " + requestDTO.getPatientId()));

        Doctor doctor = doctorRepository.findById(requestDTO.getDoctorId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Doctor not found with id : " + requestDTO.getDoctorId()));

        Appointment appointment = Appointment.builder()
                .appointmentDate(requestDTO.getAppointmentDate())
                .appointmentTime(requestDTO.getAppointmentTime())
                .status(requestDTO.getStatus())
                .patient(patient)
                .doctor(doctor)
                .build();

        Appointment savedAppointment = appointmentRepository.save(appointment);

        return AppointmentMapper.toResponseDTO(savedAppointment);
    }

    @Override
    public List<AppointmentResponseDTO> getAllAppointments()
    {
        return appointmentRepository.findAll()
                .stream()
                .map(AppointmentMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AppointmentResponseDTO getAppointmentById(Long id)
    {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Appointment not found with id : " + id));

        return AppointmentMapper.toResponseDTO(appointment);
    }

    @Override
    @Transactional
    public AppointmentResponseDTO updateAppointment(Long id, AppointmentRequestDTO requestDTO)
    {

        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Appointment not found with id : " + id));

        Patient patient = patientRepository.findById(requestDTO.getPatientId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Patient not found with id : " + requestDTO.getPatientId()));

        Doctor doctor = doctorRepository.findById(requestDTO.getDoctorId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Doctor not found with id : " + requestDTO.getDoctorId()));

        appointment.setAppointmentDate(requestDTO.getAppointmentDate());
        appointment.setAppointmentTime(requestDTO.getAppointmentTime());
        appointment.setStatus(requestDTO.getStatus());
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        Appointment updatedAppointment = appointmentRepository.save(appointment);

        return AppointmentMapper.toResponseDTO(updatedAppointment);
    }

    @Override
    @Transactional
    public void deleteAppointment(Long id)
    {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Appointment not found with id : " + id));

        appointmentRepository.delete(appointment);
    }

}