package com.rudeveloper.lms.registrationserver.controller;

import com.rudeveloper.lms.registrationserver.dto.request.RequestRegistrationDto;
import com.rudeveloper.lms.registrationserver.services.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

private final RegistrationService registrationService;
    @PostMapping
    public ResponseEntity<com.rudeveloper.lms.subjectserviceapi.util.StandardResponse> createSubject(
            @RequestBody RequestRegistrationDto requestSubjectDto
    ){
        registrationService.registerStudent(requestSubjectDto);
        return new ResponseEntity<>(
                new com.rudeveloper.lms.subjectserviceapi.util.StandardResponse(
                        201,"Student was Registered!!",requestSubjectDto.getStudentId()
                ), HttpStatus.CREATED
        );
    }
}
