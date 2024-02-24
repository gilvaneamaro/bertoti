package com.primeirocrud.crudlabiii;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Celular {
    private String modelo;
    private String marca;
    public Celular(){};

    public Celular(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
}
