package br.com.mcoder.example.aula.entity;

public class Employee {

    private Integer id;
    private Double basicValue;
    private Double discountPercent;

    public Employee() {
    }

    public Employee(Integer id, Double basicValue, Double discountPercent) {
        this.id = id;
        this.basicValue = basicValue;
        this.discountPercent = discountPercent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(Double basicValue) {
        this.basicValue = basicValue;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
