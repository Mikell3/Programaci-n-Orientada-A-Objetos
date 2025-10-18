/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;
import java.time.LocalDate;

/**
 * Clase Prestamo que gestiona el préstamo de materiales.
 */
public class Prestamo {
    private Usuario usuario;
    private MaterialBibliografico material;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    public Prestamo(Usuario usuario, MaterialBibliografico material) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(usuario.getDiasPrestamo());
        material.prestar(); // Llama al método de la interfaz Prestable
    }
    
    public Usuario getUsuario() { return usuario; }
    public MaterialBibliografico getMaterial() { return material; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
}