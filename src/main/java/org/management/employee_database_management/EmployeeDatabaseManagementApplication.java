package org.management.employee_database_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "/org.management.employee_database_management")
public class EmployeeDatabaseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDatabaseManagementApplication.class, args);
	}

}
