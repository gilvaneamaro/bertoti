package com.primeirocrud.crudlabiii;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/celular")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RestController {
    private final List<Celular> listCelular = new ArrayList<>();


    @GetMapping
    Iterable<Celular> getCelular() {

        return listCelular;
    }


    @PostMapping("/")
    ResponseEntity postCelular(@RequestBody Celular celular) {
        listCelular.add(celular);
        return ResponseEntity.status(HttpStatus.OK).body("Aparelho cadastrado com sucesso!");
    }

    @DeleteMapping
    ResponseEntity deleteCelular(@RequestBody Celular celular){

        listCelular.clear();
        /*for(Celular cel: listCelular){
            if(cel.getId().equals(celular.getId()) && cel.getMarca().equals(celular.getMarca()) && cel.getModelo().equals(celular.getModelo())){
                listCelular.remove(cel);
                return ResponseEntity.status(HttpStatus.OK).body("Aparelho removido com sucesso!");

            }
        }*/

        return ResponseEntity.status(HttpStatus.OK).body("Lista limpa.");
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