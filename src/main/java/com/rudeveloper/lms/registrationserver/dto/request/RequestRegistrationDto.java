package com.rudeveloper.lms.registrationserver.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RequestRegistrationDto {
    private Date registrationDate;
    private Long studentId;
    private Long programId;
    private String intake;
}
