/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 * Clase Libro que extiende MaterialBibliografico.
 * Implementa el método abstracto getTipo() y sobrescribe toString().
 */
public class Libro extends MaterialBibliografico {
    private String autor;
    private String isbn;
    private int paginas;
    
    public Libro(String titulo, String autor, String isbn, int anioPublicacion, int paginas) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
    }
    
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public int getPaginas() { return paginas; }
    
    @Override
    public String getTipo() {
        return "Libro";
    }
    
    @Override
    public String toString() {
        return getTitulo() + " - " + autor + " (" + getAnioPublicacion() + ")";
    }
}