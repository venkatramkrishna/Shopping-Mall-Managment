package com.example.service;

import java.util.List;

import com.example.entity.MallAdmin;

public interface MallAdminService {

	MallAdmin saveMallAdmin(MallAdmin mallAdmin);

	List<MallAdmin> fetchMallAdminList();

	MallAdmin fetchMallAdminById(Long id);

	void deleteMallAdminById(Long id);
	
	MallAdmin updateitem(Long id, MallAdmin malladmin);
}