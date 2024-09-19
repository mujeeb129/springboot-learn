package org.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Value("21")
	private int age;
	
	private Computer com;

	public Alien() {
		System.out.println("Alien Object Created");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {    // Setter Injection
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	@Autowired
	// @Qualifier("laptop")
	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}

}
