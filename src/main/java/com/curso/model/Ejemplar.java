package com.curso.model;

/**
 * Representa un ejemplar de libro en el sistema.
 * 
 * Esta clase es responsable de almacenar la información asociada
 * a un ejemplar de libro, incluyendo su ISBN, título y temática.
 */
public class Ejemplar {

    private int isbn;
    private String titulo;
    private String tematica;

    /**
     * Constructor por defecto.
     * Instancia un nuevo objeto Ejemplar con valores predeterminados.
     */
    public Ejemplar() {
        super();
    }

    /**
     * Constructor con parámetros.
     *
     * Instancia un nuevo objeto Ejemplar con los valores proporcionados.
     *
     * @param isbn      El ISBN del ejemplar.
     * @param titulo    El título del ejemplar.
     * @param tematica  La temática del ejemplar.
     */
    public Ejemplar(int isbn, String titulo, String tematica) {
        super();
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    /**
     * @return El ISBN del ejemplar.
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @return El título del ejemplar.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return La temática del ejemplar.
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * Asigna el ISBN al ejemplar.
     *
     * @param isbn El nuevo ISBN a asignar.
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * Asigna el título al ejemplar.
     *
     * @param titulo El nuevo título a asignar.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Asigna la temática al ejemplar.
     *
     * @param tematica La nueva temática a asignar.
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    /**
     * @return Representación en cadena del ejemplar.
     */
    @Override
    public String toString() {
        return "Ejemplar [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

    /**
     * @return El hashcode calculado en base al ISBN del ejemplar.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + isbn;
        return result;
    }

    /**
     * Compara este ejemplar con el objeto especificado.
     *
     * Los ejemplares se consideran iguales si y solo si el objeto
     * especificado también es un ejemplar y sus ISBN son iguales.
     *
     * @param obj El objeto con el que comparar.
     * @return {@code true} si este objeto es igual al objeto argumento;
     *         {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ejemplar other = (Ejemplar) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }
}
