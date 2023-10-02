package com.curso.service;

import java.util.List;
import com.curso.model.Ejemplar;

/**
 * Interfaz del servicio para gestionar ejemplares de libros.
 * 
 * Esta interfaz define los métodos que deben ser implementados 
 * para añadir y gestionar ejemplares de libros en el sistema.
 */
public interface EjemplaresService {

    /**
     * Añade un nuevo ejemplar de libro y retorna la lista actualizada de ejemplares.
     *
     * Este método acepta un objeto {@link Ejemplar} como parámetro y 
     * se espera que las implementaciones de esta interfaz añadan el ejemplar 
     * proporcionado a la colección de ejemplares existente y retornen la lista 
     * de ejemplares actualizada.
     *
     * @param ejemplar El nuevo {@link Ejemplar} a añadir.
     * @return Una lista de {@link Ejemplar} que representa los ejemplares actuales después de añadir el nuevo.
     */
    List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar);
}
