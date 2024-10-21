package com.seat.code.seattest;

import com.seat.code.seattest.print.IPrint;
import com.seat.code.seattest.print.StandarPrint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PositionTestApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(PositionTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PositionTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Executing...");
		MovementManagement movementManagement = new MovementManagement();
		IPrint printer= new StandarPrint();
		printer.print(movementManagement.calculateMovement(args[0], args[1]).toString());

	}
}
