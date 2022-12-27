package com.example.demo.repos;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	@Override
	public void registrar(String nombre) {
		System.out.println("Se registro : "+nombre);
	}
}
  