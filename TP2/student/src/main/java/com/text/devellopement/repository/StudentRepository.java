package com.text.devellopement.repository;

import com.text.devellopement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("select s from Student as s  where s.id = :id")
    Student SearchStudentById(@Param("id") Integer Id);

    List<Student> findByFullNameAndStillActiveIsTrue(String fullame);
    List<Student> findByRegistrationNumberLike (String registrationNumber);
    List<Student> findByRegistrationNumberLikeAndFullNameLike(String registrationNumber, String fullName);
    List<Student> findByIdIsLessThan (Integer id);
    List<Student> findByIdIsLessThanEqual (Integer id);
    List<Student> deleteByFullNameAndStillActiveIsTrue(String fullName);
}
