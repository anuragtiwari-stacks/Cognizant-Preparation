package com.anurag.hospital_management.controller;

import com.anurag.hospital_management.dto.request.AppointmentRequestDTO;
import com.anurag.hospital_management.dto.response.AppointmentResponseDTO;
import com.anurag.hospital_management.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController
{

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService)
    {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public AppointmentResponseDTO saveAppointment(
            @Valid
            @RequestBody AppointmentRequestDTO requestDTO)
    {
        return appointmentService.saveAppointment(requestDTO);
    }

    @GetMapping
    public List<AppointmentResponseDTO> getAllAppointments()
    {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public AppointmentResponseDTO getAppointmentById(@PathVariable Long id)
    {
        return appointmentService.getAppointmentById(id);
    }

    @PutMapping("/{id}")
    public AppointmentResponseDTO updateAppointment(
            @PathVariable Long id,
            @Valid
            @RequestBody AppointmentRequestDTO requestDTO)
    {
        return appointmentService.updateAppointment(id, requestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id)
    {
        appointmentService.deleteAppointment(id);
    }

}

/*
=========================================================
            APPOINTMENT REST APIs
=========================================================

1. CREATE APPOINTMENT

POST
http://localhost:9093/api/appointments

{
    "appointmentDate":"2026-07-20",
    "appointmentTime":"10:30:00",
    "status":"BOOKED",
    "patientId":1,
    "doctorId":1
}

---------------------------------------------------------

2. GET ALL APPOINTMENTS

GET
http://localhost:9093/api/appointments

---------------------------------------------------------

3. GET APPOINTMENT BY ID

GET
http://localhost:9093/api/appointments/1

---------------------------------------------------------

4. UPDATE APPOINTMENT

PUT
http://localhost:9093/api/appointments/1

{
    "appointmentDate":"2026-07-22",
    "appointmentTime":"11:00:00",
    "status":"COMPLETED",
    "patientId":1,
    "doctorId":1
}

---------------------------------------------------------

5. DELETE APPOINTMENT

DELETE
http://localhost:9093/api/appointments/1

=========================================================
*/