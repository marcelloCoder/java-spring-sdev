package br.com.mcoder.example.aula.service;

import br.com.mcoder.example.aula.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class PensionService {

    Employee employee = new Employee();
    public double discount(double amount){
        return amount * employee.getDiscountPercent();
    }
}
