/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinarios;

/**
 *
 * @author Luisk
 */
public class Veterinario {
    private String cedulaHash;
    private String nombre;
    private String correo;    
    private String telefono;  
    private String especialidad;

    public String getCedulaHash() {
        return cedulaHash;
    }

    public String getNombre() {
        return String.valueOf(nombre.hashCode());
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public Veterinario(String cedula, String nombre, String correo, String telefono, String especialidad) {
        this.cedulaHash = String.valueOf(cedula.hashCode());
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Veterinario{" +"cedulaHash='" + cedulaHash + '\'' +", nombreHash='" + getNombre() + '\'' +", especialidad='" + especialidad + '\'' +'}';
    }
   
}
