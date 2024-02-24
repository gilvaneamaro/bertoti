package com.primeirocrud.crudlabiii;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/celular")
public class RestController {
    private final List<Celular> listCelular = new ArrayList<>();

    public void requestCelular(){
        listCelular.addAll(List.of(
                new Celular("iPhone","Apple"),
                new Celular("Samsung","J5 pro"),
                new Celular("Motorola", "G10"),
                new Celular("Xiaomi","Pocophone f3")
        ));

    }

    @GetMapping
    Iterable<Celular> getCelular() {
        return listCelular;
    }


    @PostMapping
    Celular postCoffee(@RequestBody Celular celular) {
        listCelular.add(celular);
        return celular;
    }

}
