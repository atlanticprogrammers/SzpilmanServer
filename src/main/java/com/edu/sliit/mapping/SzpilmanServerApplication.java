package com.edu.sliit.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SzpilmanServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SzpilmanServerApplication.class, args);
	}
}

/**
	 create database Thogakade;
	 use Thogakade;
 */
// https://www.codejava.net/frameworks/hibernate/hibernate-many-to-many-association-with-extra-columns-in-join-table-example
// https://vladmihalcea.com/the-best-way-to-map-a-many-to-many-association-with-extra-columns-when-using-jpa-and-hibernate/