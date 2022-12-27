package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService2{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		//System.out.println("Se registro : "+nombre);
		repo.registrar(nombre);
	}
}
