package com.crudlabiii.phone.backend.web.controller;

import com.crudlabiii.phone.backend.services.CelularService;
import com.crudlabiii.phone.backend.web.dto.CelularCreateDTO;
import com.crudlabiii.phone.backend.web.dto.CelularDTO;
import com.crudlabiii.phone.backend.web.dto.CelularResponseDTO;
import com.crudlabiii.phone.backend.web.dto.CelularUpdateDescriptionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping( value ="/celular")
@CrossOrigin(origins = "*")
public class CelularController {

    @Autowired
    CelularService celularService;
    @GetMapping(value = "/find")
    public ResponseEntity<List<CelularResponseDTO>> loadAllPhones() {
        return ResponseEntity.status(HttpStatus.OK).body(celularService.findAll());
    }

    @PostMapping(value = "/new")
    public ResponseEntity<CelularResponseDTO> createPhone(@RequestBody CelularCreateDTO celularCreateDTO) {

        return ResponseEntity.status(HttpStatus.OK).body(celularService.save(celularCreateDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletePhone(@PathVariable Long id) {
        celularService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping
    public ResponseEntity<CelularResponseDTO> updatePhone(@RequestBody CelularDTO celularDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(celularService.update(celularDTO));
    }

    @PatchMapping
    public ResponseEntity<CelularResponseDTO> updateDescription(@RequestBody CelularUpdateDescriptionDTO celularUpdateDescriptionDTO){
        return ResponseEntity.status(HttpStatus.OK).body(celularService.updateDescription(celularUpdateDescriptionDTO));
    }
}
