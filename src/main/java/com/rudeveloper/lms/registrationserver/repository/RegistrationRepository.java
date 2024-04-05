package com.rudeveloper.lms.registrationserver.repository;

import com.rudeveloper.lms.registrationserver.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {




}
