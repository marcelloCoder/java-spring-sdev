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
		int id = scanner.nextInt();
		double basicValue = scanner.nextDouble();
		double discount = scanner.nextDouble();
		Employee employee = new Employee(id,basicValue, discount);
		System.out.println("\n\n\n\n");
		System.out.println("Pedido código: " + employee.getId());

		double totalValue;
		double discountValue = basicValue * (discount/100);
		double realValue = basicValue - discountValue;
		if(realValue < 100){
			totalValue = realValue + 20;
			System.out.println("Valor total: " + totalValue);
		} else if (realValue >= 100 && realValue < 200) {
			totalValue = realValue + 12;
			System.out.println("Valor total: " + totalValue);
		}else{
			totalValue = realValue;
			System.out.println("Valor total: " + totalValue);
		}



	}



}
