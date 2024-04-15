package com.crudlabiii.phone.backend.repositories;

import com.crudlabiii.phone.backend.entities.Celular;
import com.crudlabiii.phone.backend.enums.Marca;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CelularRepository extends  JpaRepository <Celular,Long > {

    @Modifying
    @Query("UPDATE Celular c SET c.modelo = :modelo, c.marca = :marca, c.descricao = :descricao WHERE c.id = :id")
    void updateCelular (Long id, String modelo, Marca marca, String descricao);

    @Modifying
    @Query("UPDATE Celular c SET c.descricao = :descricao WHERE c.id = :id")
    void updateDescricao(Long id, String descricao);

    Celular findCelularById(Long id);
}
