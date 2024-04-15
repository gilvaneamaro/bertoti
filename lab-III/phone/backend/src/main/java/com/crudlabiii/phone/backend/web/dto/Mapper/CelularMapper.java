package com.crudlabiii.phone.backend.web.dto.Mapper;

import com.crudlabiii.phone.backend.entities.Celular;
import com.crudlabiii.phone.backend.web.dto.CelularCreateDTO;
import com.crudlabiii.phone.backend.web.dto.CelularDTO;
import com.crudlabiii.phone.backend.web.dto.CelularResponseDTO;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
public class CelularMapper {
    public static CelularResponseDTO toCelularResponseDTO(Celular celular) {
        return new ModelMapper().map(celular, CelularResponseDTO.class);
    }

    public static Celular toCelular(CelularDTO celularDTO) {
        return new ModelMapper().map(celularDTO, Celular.class);
    }

    public static Celular toCelular(CelularCreateDTO celularCreateDTO) {
        return new ModelMapper().map(celularCreateDTO, Celular.class);
    }
}
