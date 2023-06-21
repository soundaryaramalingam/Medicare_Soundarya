package com.MedicareBackend;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import com.MedicareBackend.Model.Medicine;
import com.MedicareBackend.Repository.MedicineRepository;

import io.micrometer.common.util.StringUtils;


@SpringBootApplication
@ComponentScan(basePackages = "com.MedicareBackend.*")
public class MedicareBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MedicareBackendApplication.class, args);
		System.out.println("Server Started...");
	}

	@Autowired
	MedicineRepository medirepo;
	
	@Override
	public void run(String... args) {
	    String file="C:/Users/sound/OneDrive/Pictures/zebra_in_forest.jfif";
	     
		   
			this.medirepo.save(new Medicine("Meftal","fever","Feversyrup",5,150,"2023-12-12",file.getBytes()));
		
	}
}
