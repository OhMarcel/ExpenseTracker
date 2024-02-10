package dev.Marcelo.ExpenseTracker;

import org.springframework.boot.SpringApplication;//gives us the method run
import org.springframework.boot.autoconfigure.SpringBootApplication;//used for the compiler
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController//leads the compiler by annotating the class
public class ExpenseTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExpenseTrackerApplication.class, args);

	}
	/*
	//Get mapping Indicates what the program will show on the web depending on the String put ing the parenthesis
	//adding a different String means that the user will have to add the string to the url to get the desired web page
	//This allows us to add different services to our url depending on what we put
	@GetMapping("/")
	public String apiRoot(){
		return " Hello, World!";
	}

	 */




}
