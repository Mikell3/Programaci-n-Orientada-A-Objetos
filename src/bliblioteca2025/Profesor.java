/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 * Clase Profesor que extiende Usuario.
 * Sobrescribe getDiasPrestamo() (sustitución de métodos).
 */
public class Profesor extends Usuario {
    private String departamento;
    private String titulo;
    
    public Profesor(String nombre, String id, String email, String departamento, String titulo) {
        super(nombre, id, email);
        this.departamento = departamento;
        this.titulo = titulo;
    }
    
    public String getDepartamento() { return departamento; }
    public String getTitulo() { return titulo; }
    
    @Override
    public int getDiasPrestamo() {
        return 30;
    }
}