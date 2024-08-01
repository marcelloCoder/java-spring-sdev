package br.com.mcoder.example.aula.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double tax(double amount){
        if (amount < 100){
            return amount * 20;
        } else if (amount >= 100 && amount < 200) {
            return amount * 12;
        }else{
            return amount;
        }
    }
}
