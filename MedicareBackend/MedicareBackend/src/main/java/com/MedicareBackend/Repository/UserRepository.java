package com.MedicareBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicareBackend.Model.user;

@Repository
public interface UserRepository extends JpaRepository<user, String> {

}
