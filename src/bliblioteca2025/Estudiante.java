/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 * Clase Estudiante que extiende Usuario.
 * Sobrescribe getDiasPrestamo() (sustitución de métodos).
 */
public class Estudiante extends Usuario {
    private String carrera;
    private int semestre;
    
    public Estudiante(String nombre, String id, String email, String carrera, int semestre) {
        super(nombre, id, email);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public String getCarrera() { return carrera; }
    public int getSemestre() { return semestre; }
    
    @Override
    public int getDiasPrestamo() {
        return 20; // Estudiantes tienen 20 días de préstamo
    }
}