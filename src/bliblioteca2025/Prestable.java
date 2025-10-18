/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bliblioteca2025;
/**
 * Interfaz que define el comportamiento de materiales prestables.
 */
interface Prestable {
    void prestar();
    void devolver();
    boolean isDisponible();
}