package com.example.libreria.repositorios;

import com.example.libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Samuel
 */
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String> {

   
@Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarLibroPorTitulo(@Param("titulo") String titulo);
}
