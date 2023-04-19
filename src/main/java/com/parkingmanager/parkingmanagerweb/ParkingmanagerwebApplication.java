package com.parkingmanager.parkingmanagerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Programa principal de la web parkingmanagerweb, la cual muestra la aplicación que opera el resto de programas.
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 */
@SpringBootApplication
public class ParkingmanagerwebApplication {

	public static void main(String[] args) {
		/**
		 * Arranque de la aplicación del programa principal.
		 */
		SpringApplication.run(ParkingmanagerwebApplication.class, args);
	}

}
