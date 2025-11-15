package com.vf.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vf.model.Form;
import com.vf.service.FormService;

@RestController
@RequestMapping("")
@CrossOrigin
public class MainController {

	@Autowired
	private FormService service;
	
	@PostMapping("/add")
	public String add(@RequestBody Form s) {
		try {
			service.addProduct(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(s);
		return "Done";
	}
	
	@PostMapping("/add2")
	public void add2(@RequestBody String s) {
		System.out.print("1 " + s);
	}
	
	@PostMapping("/a")
	public void aaa(@RequestBody String s) {
		System.out.print("1 ");
	}
	
	@GetMapping("/get")
	public String test() {
		System.out.print("pls help");
		return "Hello??";
	}
}
