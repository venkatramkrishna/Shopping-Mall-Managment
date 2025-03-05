package com.example.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;
import com.example.entity.MallAdmin;
import com.example.repository.MallAdminRepository;

@Service
public class MallAdminServiceImpl implements MallAdminService {
	
	
	@Autowired
    private MallAdminRepository malladminRepo;

	@Override
	public MallAdmin saveMallAdmin(MallAdmin mallAdmin) {
		
		return malladminRepo.save(mallAdmin); 
	}

	@Override
	public List<MallAdmin> fetchMallAdminList() {
		
		return malladminRepo.findAll();
	}

	@Override
	public MallAdmin fetchMallAdminById(Long id) {
		// TODO Auto-generated method stub
		return malladminRepo.findById(id).get();
	}

	@Override
	public void deleteMallAdminById(Long id) {
		// TODO Auto-generated method stub
		malladminRepo.deleteById(id);
	}

	@Override
	public MallAdmin updateitem(Long id, MallAdmin malladmin) {
		// TODO Auto-generated method stub
		MallAdmin maDB = malladminRepo.findById(id).get();

	       if(Objects.nonNull(malladmin.getName()) &&
		       !"".equalsIgnoreCase(malladmin.getName())) {
		           maDB.setName(malladmin.getName());
		       }
	       if(Objects.nonNull(malladmin.getPassword()) &&
			       !"".equalsIgnoreCase(malladmin.getPassword())) {
			           maDB.setName(malladmin.getPassword());
			       }
	       if (malladmin.getPhone() != 0L) {
	    	   maDB.setPhone(malladmin.getPhone());
	    	}

	        
         return malladminRepo.save(maDB);
		}

	
	}


