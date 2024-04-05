package com.rudeveloper.lms.registrationserver.services.impl;

import com.rudeveloper.lms.registrationserver.dto.request.RequestRegistrationDto;
import com.rudeveloper.lms.registrationserver.entity.Registration;
import com.rudeveloper.lms.registrationserver.repository.RegistrationRepository;
import com.rudeveloper.lms.registrationserver.services.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
    private final RegistrationRepository repository;
    @Override
    public void registerStudent(RequestRegistrationDto dto) {
        Registration registration=Registration.builder().registrationDate(dto.getRegistrationDate())
                .studentId(dto.getStudentId())
                .programId(dto.getProgramId())
                .intake(dto.getIntake())
                .build();

        repository.save(registration);
    }
}
