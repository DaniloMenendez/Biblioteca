/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author denil
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private String isbn;
    private int anio;
    private boolean disponible;

    public Libro(int idLibro, String titulo, String isbn, int anio, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getInfo() {
    return "ID: " + idLibro + ", Título: " + titulo + ", ISBN: " + isbn + 
           ", Año: " + anio + ", Disponible: " + disponible;
}

}
