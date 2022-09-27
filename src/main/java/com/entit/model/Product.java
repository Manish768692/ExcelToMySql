package com.entit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer ProductId;
	private String ProductName;
	private String ProductDesc;
	private String ProductPrice;

}
