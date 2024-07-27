package br.com.mcoder.example.aula.entity;

public class Employee {

    private Integer cod;
    private String name;
    private Double glossSalary;

    public Employee() {
    }

    public Employee(Integer cod, String name, Double glossSalary) {
        this.cod = cod;
        this.name = name;
        this.glossSalary = glossSalary;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGlossSalary() {
        return glossSalary;
    }

    public void setGlossSalary(Double glossSalary) {
        this.glossSalary = glossSalary;
    }

}
