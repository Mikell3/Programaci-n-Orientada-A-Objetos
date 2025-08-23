/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 *
 * @author user
 */
public class MaterialBibliografico {
    private String titulo;
    private int anioPublicacion;
    private boolean disponible;
    
    public MaterialBibliografico(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }
    
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public boolean isDisponible() { return disponible; }
    
    public void prestar() { disponible = false; }
    public void devolver() { disponible = true; }
}

