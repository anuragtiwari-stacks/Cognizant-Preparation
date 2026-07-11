package com.anurag.hospital_management.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponseDTO
{

    private Long id;

    private String name;

    private String specialization;

    private Integer experience;

    private Double salary;

    private String email;

    private String phoneNumber;

}