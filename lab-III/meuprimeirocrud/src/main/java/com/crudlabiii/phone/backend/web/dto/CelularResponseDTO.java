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
public class CelularResponseDTO {
    private Long id;
    private String modelo;
    private Marca marca;
    private String descricao;
}
