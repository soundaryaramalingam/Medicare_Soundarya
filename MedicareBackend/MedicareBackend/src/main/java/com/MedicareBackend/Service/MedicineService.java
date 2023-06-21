package com.MedicareBackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicareBackend.Model.Medicine;
import com.MedicareBackend.Repository.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	MedicineRepository medicinerepo;
	
	public List<Medicine> ListMedicine(){
		
		return (List<Medicine>) medicinerepo.findAll();
	}
	
	public Medicine addMedicine(Medicine medicine) {
		return medicinerepo.save(medicine);
	}
	
	public Optional<Medicine> getMedicineById(long id) {
		return medicinerepo.findById(id);
	}
	
	public void deleteMedicine(long id) {
		medicinerepo.deleteById(id);
	}
	
	public Medicine updateMedicine(Medicine med,Long id) {
		Medicine medic=medicinerepo.findById(id).get();
		medic.setCategory(med.getCategory());
		medic.setDescr(med.getDescr());
	//	medic.setExpirydate(med.getExpirydate());
		medic.setName(med.getName());
		medic.setPrice(med.getPrice());
		medic.setQuantity(med.getQuantity());	
		return medicinerepo.save(medic);
	}
}
