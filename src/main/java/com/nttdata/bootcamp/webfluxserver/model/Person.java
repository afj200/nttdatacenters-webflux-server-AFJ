package com.nttdata.bootcamp.webfluxserver.model;

public class Person {

	/**Nombre de la persona */
	private String name;
	/**Apellidos de la persona */
	private String lastName;
	/**Edad de la persona */
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person(String name, String lastName, Integer age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	
}
