package com.entit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.entit.excel.Helper2;
import com.entit.model.Product;
import com.entit.service.MyService;

@RestController
@RequestMapping("/product")
public class MyController {
	
//	@Autowired
//	private HelperExcel helperExcel;
	
	@Autowired
	private Helper2 h2;
	
	@Autowired
	private MyService service; 
	
	@PostMapping("/excel")
	public void saveDataInDb(@RequestBody MultipartFile file) {
		if(h2.hasExcelFormat(file)) 
			service.saveDataInDb(file);
			}
	
	@GetMapping("/all")
	public List<Product> getExcellist(){
		return (List<Product>) service.getAll();
	}
 	
}
