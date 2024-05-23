package com.crudlabiii.phone.backend.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CelularUpdateDescriptionDTO {
    private Long id;
    private String descricao;
}
