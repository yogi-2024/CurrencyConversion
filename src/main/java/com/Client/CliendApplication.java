package com.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Add.calculator.Sum;

@SpringBootApplication
public class CliendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliendApplication.class, args);
		
		Sum sum= new Sum();
		int sum2 = sum.sum(10, 30);
		System.out.println(" this result is from cliend application " + sum2);
	}

}
