package com.shruti.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
