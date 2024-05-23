package com.crudlabiii.phone.backend.services;

import com.crudlabiii.phone.backend.entities.Celular;
import com.crudlabiii.phone.backend.repositories.CelularRepository;
import com.crudlabiii.phone.backend.web.dto.CelularCreateDTO;
import com.crudlabiii.phone.backend.web.dto.CelularDTO;
import com.crudlabiii.phone.backend.web.dto.CelularResponseDTO;
import com.crudlabiii.phone.backend.web.dto.CelularUpdateDescriptionDTO;
import com.crudlabiii.phone.backend.web.dto.Mapper.CelularMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CelularService {
    @Autowired
    CelularRepository celularRepository;


    public List<CelularResponseDTO> findAll(){

        return celularRepository.findAll().stream()
                .map(CelularMapper::toCelularResponseDTO)
                .collect(Collectors.toList());
    }


    public CelularResponseDTO save(CelularCreateDTO celularCreateDTO){
        Celular celular = celularRepository.save(CelularMapper.toCelular(celularCreateDTO));
        return CelularMapper.toCelularResponseDTO(celularRepository.findCelularById(celular.getId()));
    }

    public void delete(Long id){
        Celular celular = celularRepository.findById(id).orElse(null);
        if(celular != null){celularRepository.deleteById(id);}
    }

    public CelularResponseDTO findById(Long id){
        Celular celular = celularRepository.findById(id).orElse(null);
        return CelularMapper.toCelularResponseDTO(celular);
    }

    @Transactional
    public CelularResponseDTO update(CelularDTO celularDTO){
        Optional<Celular> celular = celularRepository.findById(celularDTO.getId());
        if (celular.isPresent()) {
            celularRepository.updateCelular(celularDTO.getId(), celularDTO.getModelo(), celularDTO.getMarca(), celularDTO.getDescricao());
            return CelularMapper.toCelularResponseDTO(celular.get());
        }
        return null;
    }

    @Transactional
    public CelularResponseDTO updateDescription(CelularUpdateDescriptionDTO celularUpdateDescriptionDTO){
        System.out.println(celularUpdateDescriptionDTO.getId());
        Optional<Celular> celular = celularRepository.findById(celularUpdateDescriptionDTO.getId());
        if (celular.isPresent()) {
            celularRepository.updateDescricao(celularUpdateDescriptionDTO.getId(), celularUpdateDescriptionDTO.getDescricao());
            return CelularMapper.toCelularResponseDTO(celular.get());
        }
        return null;
    }
}
