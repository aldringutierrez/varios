package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IPersonaService2;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner{
	public static Logger LOG = LoggerFactory.getLogger(Demo2Application.class);

	@Autowired
	private IPersonaService2	servicio;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		//System.out.println("qqqqqqqqqqqqqqqqqqqqq");
		//LOG.info("qqqqqqqqqqqqqqqqqqqqq");
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("wwwwwwwwwwwwwwwwwwwwwwww");
		//LOG.info("wwwwwwwwwwwwwwwwwwwww2");
		servicio.registrar("ayo");
	}
	
	
	

}
