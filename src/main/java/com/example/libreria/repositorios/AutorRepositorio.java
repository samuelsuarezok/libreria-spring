package com.example.libreria.repositorios;

import com.example.libreria.entidades.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Samuel
 */

/*JpaRepository<Autor, String> INDICA QUE HEREDA DE JPAREPOSITORY, QUE ES UN REPOSITORIO DE AUTOR Y LA LLAVE PRIMARIA ES String*/

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {
    
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Autor buscarAutorPorNombre(@Param("nombre") String nombre);
    
    
    
}
