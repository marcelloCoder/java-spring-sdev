package br.com.mcoder.example.aula.service;

import br.com.mcoder.example.aula.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Double total(Order order){
        Double percent = order.getBasic() * order.getDiscount() / 100;
        return percent;
    }
}
