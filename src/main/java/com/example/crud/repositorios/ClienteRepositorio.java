/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crud.repositorios;

import com.example.crud.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author hgauna
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {

    @Query("SELECT cliente FROM cliente c WHERE c.dni = :dni")
    Cliente searchByEmail(@Param("dni") String dni);

}
