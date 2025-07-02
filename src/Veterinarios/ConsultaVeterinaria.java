/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinarios;

import Animales.Animal;
import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class ConsultaVeterinaria {
    private String id;
    private Animal animal;
    private Veterinario veterinario;
    private LocalDate fechaConsulta;
    private String diagnostico;
    private String tratamiento;

    public String getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    public ConsultaVeterinaria(String id, Animal animal, Veterinario veterinario, LocalDate fechaConsulta, String diagnostico, String tratamiento) {
        this.id = id;
        this.animal = animal;
        this.veterinario = veterinario;
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    @Override
    public String toString() {
        return "ConsultaVeterinaria{" + "id='" + id + '\'' + ", animal=" + animal + ", veterinario=" + veterinario + ", fechaConsulta=" + fechaConsulta + ", diagnostico='" + diagnostico + '\'' + ", tratamiento='" + tratamiento + '\'' +'}';
    }
}
