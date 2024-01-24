package com.example.demo.controller;

import com.example.demo.Entity.Order;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {


    @RequestMapping(value = "/filter", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Order> filter() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1, "Закиров", "Айдар", "Ринатович", 1, "Петров", "Петр", "Renault Logan", "т123мм18", "+79821221315", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(2, 2, "Холодков", "Дмитрий", "Олегович", 1, "Петров", "Петр", "Chevrolet Laccetti", "с124см18", "+79991221315", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(3, 3, "Тарасов", "Андрей", "Евгеньевич", 2, "Вахрушев", "Александр", "Renault Sandero", "м723мм18", "+79129991307", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(4, 4, "Ибрагимов", "Антон", "Сергеевич", 2, "Вахрушев", "Александр", "Honda Accord", "в328мо16", "+79091631218", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(5, 5, "Иванов", "Иван", "Иванович", 3, "Егоров", "Семен", "ВАЗ 2126", "о123мо18", "+79820661536", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(6, 6, "Моржов", "Сергей", "Александрович", 3, "Егоров", "Семен", "Мазда 3", "е993мт18", "+79123270757", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(7, 7, "Кузнецов", "Константин", "Вячеславович", 4, "Симанов", "Станислав", "Ford Focus2", "х777тт18", "+79821223111", 1, "Ожидает выполнения", new Date(), null, null));
        orders.add(new Order(9, 9, "Мартиросян", "Егор", "Тигранович", 1, "Петров", "Петр", "Lada Vesta ", "н517ор18", "+79820010203", 1, "Ожидает выполнения", new Date(), null, null));
        return orders;
    }
}
