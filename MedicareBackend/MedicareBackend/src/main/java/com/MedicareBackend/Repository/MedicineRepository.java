package com.MedicareBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MedicareBackend.Model.Medicine;

@Repository
public interface MedicineRepository extends CrudRepository<Medicine, Long>{

	
	
}
