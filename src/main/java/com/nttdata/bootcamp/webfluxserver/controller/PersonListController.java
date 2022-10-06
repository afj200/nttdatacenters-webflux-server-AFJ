package com.nttdata.bootcamp.webfluxserver.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webfluxserver.model.Person;
import com.nttdata.bootcamp.webfluxserver.service.PersonListServiceI;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	/**Instancia del servicio */
	@Autowired
	PersonListServiceI personService;
	
	/**
	 * Método que recoge una petición HTTP de tipo GET y devuelve un Flux de Person con una persona creada en el servicio.
	 * 
	 * @return Flux<Person>
	 */
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		
		return personService.personList1();
	}
	
	/**
	 * Método que recoge una petición HTTP de tipo GET y devuelve un Flux de Person con una persona creada en el servicio.
	 * 
	 * @return Flux<Person>
	 */
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		
		return personService.personList2();
	}
	
	/**
	 * Método que recoge una petición HTTP de tipo GET y devuelve un Flux de Person con una persona creada en el servicio.
	 * 
	 * @return Flux<Person>
	 */
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		return personService.personList3();
	}
	
	/**
	 * Método que recoge una petición HTTP de tipo GET y devuelve un Flux de Person con una persona creada en el servicio.
	 * 
	 * @return Flux<Person>
	 */
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		return personService.personList4();
	}
	
}
