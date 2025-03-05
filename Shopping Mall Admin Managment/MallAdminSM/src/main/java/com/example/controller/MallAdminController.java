package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.example.entity.MallAdmin;
import com.example.service.MallAdminService;
import org.springframework.web.bind.annotation.PutMapping;

//handels the http request
//import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;

@RestController
public class MallAdminController {
	
	//private static final MallAdmin  = null;
	@Autowired
    private MallAdminService mallAdminService;
	
	
	 @PostMapping("/MallAdmin")
		public MallAdmin saveMallAdmin(@RequestBody MallAdmin mallAdmin) {
	    	
		 return mallAdminService.saveMallAdmin(mallAdmin);			
		}
	 
	 @GetMapping("/MallAdmin")
	    public List<MallAdmin> fetchMallAdminList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return mallAdminService.fetchMallAdminList();
	    }
	 
	 @GetMapping("/MallAdmin/{id}")
	    public MallAdmin fetchMallAdminById(@PathVariable("id") Long id)
	            {
	        return mallAdminService.fetchMallAdminById(id);
	    }
	    
	 @DeleteMapping("/MallAdmin/{id}")
	    public String deleteMallAdminById(@PathVariable("id") Long id) {
		 mallAdminService.deleteMallAdminById(id);
	        return "Department deleted Successfully!!";
	    }
	 @PutMapping("MallAdmin/{id}")
	 public MallAdmin putMethodName(@PathVariable Long id, @RequestBody MallAdmin malladmin ) {
	 	//TODO: process PUT request
		 return mallAdminService.updateitem(id, malladmin);
		 }

}
