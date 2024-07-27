package br.com.mcoder.example.aula;

import br.com.mcoder.example.aula.entity.Employee;
import br.com.mcoder.example.aula.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int cod = scanner.nextInt();
		double valor = scanner.nextDouble();
		Employee employee = new Employee(cod,null, valor);
		System.out.println("\n\n\n\n");
		System.out.println("Pedido código: " + employee.getCod());
		System.out.println(employee.getGlossSalary());
		System.out.println("Valor total: " + salaryService.netSalary(employee));
	}

}
