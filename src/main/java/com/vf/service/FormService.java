package com.vf.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vf.model.Form;
import com.vf.repo.FormRepo;

@Service
public class FormService {
	
	@Autowired
	private FormRepo repo;
	
	public Form addProduct(Form s) throws IOException {
		repo.save(s);
		return s;
	}
	
}
