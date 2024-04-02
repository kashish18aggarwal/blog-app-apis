package com.learning.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
