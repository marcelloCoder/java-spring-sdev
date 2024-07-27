package br.com.mcoder.example.aula.service;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

    public double discount(double amount){
        return amount * 0.1;
    }
}
