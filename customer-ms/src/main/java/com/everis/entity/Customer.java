package com.everis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Entity
@Table(name = "tbl_customers")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer implements Serializable {

private static final long serialVersionUID = 1L; 

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 

    @NotEmpty(message = "El número de documento no puede ser vacío")
    @Size( min = 8 , max = 8, message = "El tamaño del número de documento es 8")
    private String numberID;

    @NotEmpty(message = "El nombre no puede ser vacío")
    private String firstName;
 
    @NotEmpty(message = "El apellido no puede ser vacío")
    private String lastName;
    
    @NotEmpty(message = "el correo no puede estar vacío")
    @Email(message = "no es un dirección de correo bien formada")
    private String email;

    private String photoUrl;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Region region;

    private String state;

	
} 