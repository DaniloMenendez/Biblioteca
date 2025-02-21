/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.time.LocalDate;

/**
 *
 * @author denil
 */
public class Biblioteca {

    public static void main(String[] args) {
         Usuario usuario = new Usuario(1, "Juan", "Perez", "juan@gmail.com");
        
       
        // Crear libro
        Libro libro = new Libro(101, "Don Quijote", "123-456-789", 1605, true);
        
        // Mostrar información del libro antes del préstamo
        System.out.println("Información del libro antes del préstamo: " + libro.getInfo());

        // Crear un préstamo
        Prestamo prestamo = new Prestamo(usuario, libro, LocalDate.now(), LocalDate.now().plusDays(14));

        // Mostrar información después del préstamo
        System.out.println("Información del libro después del préstamo: " + libro.getInfo());

        // Devolver el libro
        boolean devuelto = prestamo.devolverLibro();
        System.out.println("¿Libro devuelto con éxito? " + devuelto);

        // Mostrar información después de la devolución
        System.out.println("Información del libro después de la devolución: " + libro.getInfo());
    
    }
}
