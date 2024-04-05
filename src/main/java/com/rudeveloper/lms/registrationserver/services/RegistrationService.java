package com.rudeveloper.lms.registrationserver.services;

import com.rudeveloper.lms.registrationserver.dto.request.RequestRegistrationDto;

public interface RegistrationService {
    public void registerStudent(RequestRegistrationDto dto);
}
