/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 *
 * @author user
 */
public class Usuario {
    private String nombre;
    private String id;
    private String email;
    
    public Usuario(String nombre, String id, String email) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public String getEmail() { return email; }
    
    // Método que pueden sobrescribir las subclases
    public int getDiasPrestamo() {
        return 15; // Por defecto 15 días
    }
}
