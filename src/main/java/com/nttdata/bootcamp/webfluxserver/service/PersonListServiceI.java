package com.nttdata.bootcamp.webfluxserver.service;

import com.nttdata.bootcamp.webfluxserver.model.Person;

import reactor.core.publisher.Flux;

public interface PersonListServiceI {

	/**
	 * Método que devuelve Flux de Person con un apersona creada y un delay predefinido.
	 * 
	 * @return Flux<Person>
	 */
	public Flux<Person> personList1();
	
	/**
	 * Método que devuelve Flux de Person con un apersona creada y un delay predefinido.
	 * 
	 * @return Flux<Person>
	 */
	public Flux<Person> personList2();
	
	/**
	 * Método que devuelve Flux de Person con un apersona creada y un delay predefinido.
	 * 
	 * @return Flux<Person>
	 */
	public Flux<Person> personList3();
	
	/**
	 * Método que devuelve Flux de Person con un apersona creada y un delay predefinido.
	 * 
	 * @return Flux<Person>
	 */
	public Flux<Person> personList4();
	
}
