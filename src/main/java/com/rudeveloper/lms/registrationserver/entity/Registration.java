package com.rudeveloper.lms.registrationserver.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="registration")

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date registrationDate;
    private Long studentId;
    private Long programId;
    private String intake;
    private boolean verified;
}
