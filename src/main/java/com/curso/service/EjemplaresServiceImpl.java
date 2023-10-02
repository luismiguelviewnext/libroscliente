package com.curso.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.curso.model.Ejemplar;

/**
 * Implementación del servicio para gestionar ejemplares de libros.
 * 
 * Esta clase implementa los métodos definidos en la interfaz 
 * {@link EjemplaresService} para añadir y gestionar ejemplares de libros.
 */
@Service
public class EjemplaresServiceImpl implements EjemplaresService{

    @Autowired
    RestTemplate template;
    
    private String url = "http://localhost:8080/";

    /**
     * Añade un nuevo ejemplar de libro y retorna la lista actualizada de ejemplares.
     *
     * Este método realiza una petición POST al servicio en la URL especificada
     * para añadir un nuevo ejemplar, y luego realiza una petición GET para obtener
     * la lista actualizada de ejemplares.
     *
     * @param ejemplar El nuevo {@link Ejemplar} a añadir.
     * @return Una lista de {@link Ejemplar} que representa los ejemplares actuales después de añadir el nuevo.
     */
    @Override
    public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
        template.postForLocation(url + "libro" , ejemplar);
        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }
}
