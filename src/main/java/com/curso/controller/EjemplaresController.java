package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Ejemplar;
import com.curso.service.EjemplaresService;

/**
 * Controlador que gestiona las operaciones de Ejemplares.
 * 
 * Este controlador proporciona un punto de acceso para las operaciones CRUD
 * relacionadas con los ejemplares, y usa {@link EjemplaresService} para interactuar con la capa de servicios.
 */
@RestController
public class EjemplaresController {
    
    @Autowired
    EjemplaresService service; // Servicio de ejemplares inyectado.

    /**
     * Añade un nuevo ejemplar a la lista de ejemplares.
     * 
     * Este método se encarga de recibir la información necesaria de un ejemplar,
     * crea un nuevo objeto de tipo {@link Ejemplar} y lo añade a la lista de ejemplares
     * mediante el servicio {@link EjemplaresService}.
     *
     * @param isbn      El código ISBN del ejemplar.
     * @param titulo    El título del ejemplar.
     * @param tematica  La temática del ejemplar.
     * @return Una lista de {@link Ejemplar} que representa los ejemplares actuales después de añadir el nuevo.
     */
    @PostMapping("ejemplar/{isbn}/{titulo}/{tematica}")
    public List<Ejemplar> altaEjemplar(
        @PathVariable("isbn") int isbn,
        @PathVariable("titulo") String titulo,
        @PathVariable("tematica") String tematica) { 
            Ejemplar ejemplar = new Ejemplar (isbn, titulo, tematica); // Creación del nuevo ejemplar.
            return service.nuevoEjemplar(ejemplar); // Adición del nuevo ejemplar y retorno de la lista actualizada
        }
    
}
