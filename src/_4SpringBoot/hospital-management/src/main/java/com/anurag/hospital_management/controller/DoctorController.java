package com.anurag.hospital_management.controller;

import com.anurag.hospital_management.dto.request.DoctorRequestDTO;
import com.anurag.hospital_management.dto.response.DoctorResponseDTO;
import com.anurag.hospital_management.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController
{

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService)
    {
        this.doctorService = doctorService;
    }

    @PostMapping
    public DoctorResponseDTO saveDoctor(
            @Valid
            @RequestBody DoctorRequestDTO requestDTO)
    {
        return doctorService.saveDoctor(requestDTO);
    }

    @GetMapping
    public List<DoctorResponseDTO> getAllDoctors()
    {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public DoctorResponseDTO getDoctorById(@PathVariable Long id)
    {
        return doctorService.getDoctorById(id);
    }

    @PutMapping("/{id}")
    public DoctorResponseDTO updateDoctor(
            @PathVariable Long id,
            @Valid
            @RequestBody DoctorRequestDTO requestDTO)
    {
        return doctorService.updateDoctor(id, requestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id)
    {
        doctorService.deleteDoctor(id);
    }

}

/*
=========================================================
                DOCTOR REST APIs
=========================================================

1. CREATE DOCTOR

POST
http://localhost:9093/api/doctors

{
    "name":"Dr. Raj",
    "specialization":"Cardiologist",
    "experience":10,
    "salary":150000,
    "email":"raj@gmail.com",
    "phoneNumber":"9876543210"
}

---------------------------------------------------------

2. GET ALL DOCTORS

GET
http://localhost:9093/api/doctors

---------------------------------------------------------

3. GET DOCTOR BY ID

GET
http://localhost:9093/api/doctors/1

---------------------------------------------------------

4. UPDATE DOCTOR

PUT
http://localhost:9093/api/doctors/1

{
    "name":"Dr. Raj Sharma",
    "specialization":"Neurologist",
    "experience":12,
    "salary":180000,
    "email":"raj@gmail.com",
    "phoneNumber":"9876543210"
}

---------------------------------------------------------

5. DELETE DOCTOR

DELETE
http://localhost:9093/api/doctors/1

=========================================================
*/