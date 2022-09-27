package com.entit.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.entit.excel.Helper2;
import com.entit.model.Product;
import com.entit.repo.MyRepo;

@Service
public class MyService {

	@Autowired
	private MyRepo repo;

	@Autowired
	private Helper2 hExcel;
	
	public void saveDataInDb(MultipartFile file) {
		List<Product> products;
		try {
			products = hExcel.convertExcelToProducts(file.getInputStream());
			repo.saveAll(products);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Product> getAll() {
		return repo.findAll();
	}

}
