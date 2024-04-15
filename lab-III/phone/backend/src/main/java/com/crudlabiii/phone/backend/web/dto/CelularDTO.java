package com.crudlabiii.phone.backend.web.dto;

import com.crudlabiii.phone.backend.enums.Marca;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CelularDTO {
    Long id;
    String modelo;
    Marca marca;
    String descricao;
}
