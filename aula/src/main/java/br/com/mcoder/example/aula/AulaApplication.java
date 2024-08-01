package br.com.mcoder.example.aula;

import br.com.mcoder.example.aula.entity.Employee;
import br.com.mcoder.example.aula.entity.Order;
import br.com.mcoder.example.aula.service.OrderService;
import br.com.mcoder.example.aula.service.SalaryService;
import br.com.mcoder.example.aula.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);


		System.out.println("Digite o código do pedido:");
		Integer code = scanner.nextInt();

		System.out.println("Digite o valor básico do pedido:");
		Double basic = scanner.nextDouble();

		System.out.println("Digite o valor do desconto:");
		Double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);
		Double shipment = shippingService.shipment(order);
		Double total = orderService.total(order);

		System.out.printf("Pedido código: %d Valor total: %.2f%n", order.getCode(), shipment - total);


	}



}
