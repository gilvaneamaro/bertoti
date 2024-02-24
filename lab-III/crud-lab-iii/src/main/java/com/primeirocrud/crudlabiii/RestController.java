package com.primeirocrud.crudlabiii;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/celular")
public class RestController {
    private final List<Celular> listCelular = new ArrayList<>();

    public void requestCelular(){
        listCelular.addAll(List.of(
                new Celular("iPhone","Apple", 1),
                new Celular("Samsung","J5 pro",2),
                new Celular("Motorola", "G10",3),
                new Celular("Xiaomi","Pocophone f3", 4)
        ));

    }

    @GetMapping
    Iterable<Celular> getCelular() {
        requestCelular();
        return listCelular;
    }


    @PostMapping
    Celular postCelular(@RequestBody Celular celular) {
        listCelular.add(celular);
        return celular;
    }

    @DeleteMapping
    Celular deleteCelular(@RequestBody Celular celular){
        int id = celular.getId();
        listCelular.removeIf(cel -> Objects.equals(cel.getId(), celular.getId()));
       return celular;
   }
}
