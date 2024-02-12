package com.luizxdev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizxdev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
