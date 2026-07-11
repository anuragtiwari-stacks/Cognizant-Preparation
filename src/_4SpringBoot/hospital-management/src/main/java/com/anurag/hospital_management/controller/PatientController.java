package com.anurag.hospital_management.controller;

import com.anurag.hospital_management.dto.request.PatientRequestDTO;
import com.anurag.hospital_management.dto.response.PatientResponseDTO;
import com.anurag.hospital_management.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController
{

    private final PatientService patientService;

    public PatientController(PatientService patientService)
    {
        this.patientService = patientService;
    }

    @PostMapping
    public PatientResponseDTO savePatient(
            @Valid
            @RequestBody PatientRequestDTO requestDTO)
    {
        return patientService.savePatient(requestDTO);
    }

    @GetMapping
    public List<PatientResponseDTO> getAllPatients()
    {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public PatientResponseDTO getPatientById(@PathVariable Long id)
    {
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public PatientResponseDTO updatePatient(
            @PathVariable Long id,
            @Valid
            @RequestBody PatientRequestDTO requestDTO)
    {
        return patientService.updatePatient(id, requestDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id)
    {
        patientService.deletePatient(id);
    }

}

/*
=========================================================
                PATIENT REST APIs
=========================================================

1. CREATE PATIENT

POST
http://localhost:9093/api/patients

{
    "firstName":"Anurag",
    "lastName":"Tiwari",
    "age":22,
    "gender":"Male",
    "email":"anurag@gmail.com",
    "phoneNumber":"9876543210",
    "address":"Bhubaneswar"
}

---------------------------------------------------------

2. GET ALL PATIENTS

GET
http://localhost:9093/api/patients

---------------------------------------------------------

3. GET PATIENT BY ID

GET
http://localhost:9093/api/patients/1

---------------------------------------------------------

4. UPDATE PATIENT

PUT
http://localhost:9093/api/patients/1

{
    "firstName":"Anurag",
    "lastName":"Tiwari",
    "age":23,
    "gender":"Male",
    "email":"anurag@gmail.com",
    "phoneNumber":"9876543210",
    "address":"Odisha"
}

---------------------------------------------------------

5. DELETE PATIENT

DELETE
http://localhost:9093/api/patients/1

=========================================================
*/