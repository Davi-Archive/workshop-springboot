package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@Repository   //not necessary because it's inheritance from JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}
