/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;

/**
 *
 * @author user
 */
public class Revista extends MaterialBibliografico {
    private int numero;
    private String editorial;
    
    public Revista(String titulo, int numero, int anioPublicacion, String editorial) {
        super(titulo, anioPublicacion);
        this.numero = numero;
        this.editorial = editorial;
    }
    
    public int getNumero() { return numero; }
    public String getEditorial() { return editorial; }
    
    @Override
    public String toString() {
        return getTitulo() + " - N° " + numero + " (" + getAnioPublicacion() + ")";
    }
}
