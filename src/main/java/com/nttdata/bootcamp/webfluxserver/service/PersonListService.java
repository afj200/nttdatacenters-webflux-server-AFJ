package com.nttdata.bootcamp.webfluxserver.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.webfluxserver.model.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonListService implements PersonListServiceI{

	@Override
	public Flux<Person> personList1() {
		
		return Flux.just(new Person("Angel", "Fuente", 20)).delayElements(Duration.ofSeconds(5));
	}

	@Override
	public Flux<Person> personList2() {
		Flux<Person> personFlux = Flux.just(new Person("Jaime", "Tirado", 50)).delayElements(Duration.ofSeconds(1));
		return personFlux;
	}

	@Override
	public Flux<Person> personList3() {
		// TODO Auto-generated method stub
		return Flux.just(new Person("Manuel", "Perez", 40)).delayElements(Duration.ofSeconds(8));
	}

	@Override
	public Flux<Person> personList4() {
		
		return Flux.just(new Person("Antonio", "Vargas", 30)).delayElements(Duration.ofSeconds(9));
	}

}
