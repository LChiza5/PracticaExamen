/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author ilope
 */
public class Animal {
    private int id;
    private String nombre; 
    private LocalDate fechaNacimiento;
    private String especie; 
    private EstadoAnimal estado;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return hash(nombre);
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Animal(int id, String nombre, LocalDate fechaNacimiento, String especie, EstadoAnimal estado) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.estado = estado;
    }
    
    public int calcularEdad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    
    private String hash(String texto) {
        int hash = texto.hashCode();
        return Integer.toHexString(hash);
    }
}
