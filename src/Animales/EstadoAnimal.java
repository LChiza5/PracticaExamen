/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animales;

/**
 *
 * @author ilope
 */
public enum EstadoAnimal {
    EN_ADOPCION("En adopción"),
    ADOPTADO("Adoptado"),
    EN_TRATAMIENTO("En tratamiento");

    private final String texto;

    EstadoAnimal(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
