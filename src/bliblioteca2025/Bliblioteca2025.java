/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bliblioteca2025;

/**
 * Clase principal que demuestra el uso del sistema de biblioteca.
 */
public class Bliblioteca2025 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro = new Libro("Calculo Diferencial", "Autor Matematicas", "123456", 2020, 350);
        Revista revista = new Revista("Science Today", 45, 2023, "Science Press");

        Estudiante estudiante = new Estudiante("Maria", "E001", "maria@uni.edu", "Ingenieria", 4);
        Profesor profesor = new Profesor("Dr. Garcia", "P001", "garcia@uni.edu", "Matematicas", "PhD");

        biblioteca.agregarMaterial(libro);
        biblioteca.agregarMaterial(revista);
        biblioteca.registrarUsuario(estudiante);
        biblioteca.registrarUsuario(profesor);

        System.out.println("Dias de prestamo:");
        System.out.println("Estudiante: " + estudiante.getDiasPrestamo() + " días");
        System.out.println("Profesor: " + profesor.getDiasPrestamo() + " días");

        biblioteca.realizarPrestamo(estudiante, libro);
        biblioteca.realizarPrestamo(profesor, revista);
        
        // Usar el método polimórfico para listar materiales
        biblioteca.listarMateriales();
        
        // Ejemplo de devolución
        biblioteca.devolverPrestamo(estudiante, libro);
        biblioteca.listarMateriales();
    }
}