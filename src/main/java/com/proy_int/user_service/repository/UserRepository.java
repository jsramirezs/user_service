package com.proy_int.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proy_int.user_service.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByCedula(String cedula);

}
