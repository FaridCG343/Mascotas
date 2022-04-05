/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

/**
 *
 * @author farid
 */
public class Perros extends Mascota {

    private String Raza;
    private boolean Pedigree;

    public Perros() {
        super();
    }

    public Perros(String Raza, boolean Pedigree, String Nombre, int edadMeses) {
        super(Nombre, edadMeses);
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    public Perros(Perros Mientras) {
        super(Mientras.Nombre, Mientras.edadMeses);
        this.Raza = Mientras.Raza;
        this.Pedigree = Mientras.Pedigree;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public boolean isPedigree() {
        return Pedigree;
    }

    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    @Override
    public String toString() {

        return super.toString() + " \nPerro: Raza: "+Raza+"  Pedigree: "+Pedigree;
    }

}
