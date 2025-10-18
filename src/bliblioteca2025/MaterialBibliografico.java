package bliblioteca2025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public abstract class MaterialBibliografico implements Prestable {
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
    
    @Override
    public boolean isDisponible() { return disponible; }
    
    @Override
    public void prestar() { disponible = false; }
    
    @Override
    public void devolver() { disponible = true; }
    
    // Método abstracto que las subclases deben implementar
    public abstract String getTipo();
    
    @Override
    public abstract String toString();
}