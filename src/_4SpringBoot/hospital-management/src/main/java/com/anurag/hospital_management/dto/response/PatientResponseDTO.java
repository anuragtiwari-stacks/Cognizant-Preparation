package com.anurag.hospital_management.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientResponseDTO
{

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String gender;

    private String email;

    private String phoneNumber;

    private String address;

}