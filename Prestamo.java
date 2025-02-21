/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.time.LocalDate;

/**
 *
 * @author denil
 */


public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro.setDisponible(false);  // Marca el libro como prestado
    }

    public boolean devolverLibro() {
        if (!libro.isDisponible()) {
            libro.setDisponible(true);
            return true;
        }
        return false;
    }

    public Libro getLibro() {
        return libro;
    }
}
