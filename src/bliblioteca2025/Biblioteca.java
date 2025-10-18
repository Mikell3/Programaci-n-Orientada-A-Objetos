/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bliblioteca2025;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<MaterialBibliografico> materiales;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;
    
    public Biblioteca() {
        materiales = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }
    
    public void agregarMaterial(MaterialBibliografico material) {
        materiales.add(material);
    }
    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void realizarPrestamo(Usuario usuario, MaterialBibliografico material) {
        if (material.isDisponible()) {
            Prestamo prestamo = new Prestamo(usuario, material);
            prestamos.add(prestamo);
            System.out.println("Prestamo realizado: " + material.getTitulo() + " para " + usuario.getNombre());
        } else {
            System.out.println("Material no disponible: " + material.getTitulo());
        }
    }
    
    // Nuevo método para devolver un préstamo, utilizando polimorfismo
    public void devolverPrestamo(Usuario usuario, MaterialBibliografico material) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuario) && prestamo.getMaterial().equals(material)) {
                material.devolver(); // Llama al método de la interfaz Prestable
                prestamos.remove(prestamo);
                System.out.println("Devolución realizada: " + material.getTitulo() + " por " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Préstamo no encontrado para devolver.");
    }
    
    // Método que demuestra polimorfismo: imprime todos los materiales usando toString() sobrescrito
    public void listarMateriales() {
        System.out.println("\nMateriales en biblioteca:");
        for (MaterialBibliografico material : materiales) {
            System.out.println(material.toString() + " - Tipo: " + material.getTipo());
        }
    }
}