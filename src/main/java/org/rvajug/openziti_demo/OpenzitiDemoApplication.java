package org.rvajug.openziti_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "org.openziti", // Include OpenZiti components
    "org.rvajug.openziti_demo" // Include your application's components
})
public class OpenzitiDemoApplication
{

	public static void main(String[] args) {
		SpringApplication.run(OpenzitiDemoApplication.class, args);
	}

}
