package com.primeirocrud.crudlabiii;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/celular")
public class RestController {
    private final List<Celular> listCelular = new ArrayList<>();


    @GetMapping
    Iterable<Celular> getCelular() {

        return listCelular;
    }


    @PostMapping
    Celular postCelular(@RequestBody Celular celular) {
        listCelular.add(celular);
        return celular;
    }

    @DeleteMapping
    ResponseEntity deleteCelular(@RequestBody Celular celular){
        for(Celular cel: listCelular){
            if(cel.getId().equals(celular.getId()) && cel.getMarca().equals(celular.getMarca()) && cel.getModelo().equals(celular.getModelo())){
                listCelular.remove(cel);
                return ResponseEntity.status(HttpStatus.OK).body("Aparelho removido com sucesso!");

            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Aparelho não encontrado!");
   }

   @PutMapping
   ResponseEntity putCelular(@RequestBody Celular celular){

        for(Celular cel: listCelular){
            if(cel.getId().equals(celular.getId())) {
                cel.setMarca(cel.getMarca());
                cel.setModelo(cel.getModelo());
                return ResponseEntity.status(HttpStatus.OK).body("Aparelho atualizado com sucesso!");
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Aparelho não encontrado!");
   };

}