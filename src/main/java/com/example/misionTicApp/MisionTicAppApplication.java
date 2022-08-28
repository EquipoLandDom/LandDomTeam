package com.example.misionTicApp;

import com.example.misionTicApp.View.ViewMovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MisionTicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MisionTicAppApplication.class, args);
		ViewMovimientoDinero mont1 = new ViewMovimientoDinero();
		mont1.showMovimientoDinero("ingreso", 50000);
	}

}