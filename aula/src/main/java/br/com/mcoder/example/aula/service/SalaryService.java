package br.com.mcoder.example.aula.service;

import br.com.mcoder.example.aula.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee){
        return employee.getBasicValue() - taxService.tax(employee.getBasicValue())
                - pensionService.discount(employee.getBasicValue());
    }
}
