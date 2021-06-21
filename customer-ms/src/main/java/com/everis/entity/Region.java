package com.everis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_regions")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Region implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  
	private String name; 

}