package com.MedicareBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MedicareBackend.Model.Medicine;
import com.MedicareBackend.Service.MedicineService;

import ch.qos.logback.core.util.FileUtil;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MedicineController {
@Autowired
MedicineService medicineserv;

@GetMapping("/listMedicines")
public ResponseEntity<List<Medicine>> listMedicines() {
	
	List<Medicine> medicine=medicineserv.ListMedicine();
	return new ResponseEntity<List<Medicine>>(medicine,HttpStatus.OK);
	
}

@PostMapping("/addMedicine")
public Medicine addMedicine(@RequestBody Medicine med) {
	System.out.println("entered"+med);
	Medicine med1=medicineserv.addMedicine(med);
	return med1;
}

@PostMapping("/updateMedicine/{id}")
public Medicine updateMedicine(@RequestBody Medicine med, @PathVariable("id") long id) {
	System.out.println("entered update backend");
	return medicineserv.updateMedicine(med, id);
}

@GetMapping("/deleteMedicine/{id}")
public String deleteMedicine(@PathVariable("id") long id) {
	medicineserv.deleteMedicine(id);
	return "Medicine Deleted Successfully";
}

@GetMapping("/{id}")
public Medicine getMedicineById(@PathVariable("id") long id) {
	System.out.println("Entered get medicine by id");
	return medicineserv.getMedicineById(id).get();
}
	
}
