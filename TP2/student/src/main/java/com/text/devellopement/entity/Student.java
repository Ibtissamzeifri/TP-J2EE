package com.text.devellopement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Table (name="Student")
@Data  @AllArgsConstructor @NoArgsConstructor
public class Student {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

  @Column(name="REGISTRATION_N",unique=true)
    private String registrationNumber;

  @Column(name="Name" , length = 30 ,nullable = false)
    private String fullName;

  @Temporal(TemporalType.DATE)
    private Date birthday;

  private Boolean stillActive;

  @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date lastConnection;
}
