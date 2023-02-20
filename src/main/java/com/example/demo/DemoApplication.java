package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//marioGame m=new marioGame();
		//pacGame p=new pacGame();
		superCantro s= new superCantro();
		gameRunnable gr=new gameRunnable(s);
		gr.runner();
		
		
	}

}
