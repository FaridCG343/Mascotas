/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

/**
 *
 * @author farid
 */
public class Gatos extends Mascota {

    private String Raza;
    private boolean Pedigree;

    public Gatos(String Raza, boolean Pedigree, String Nombre, int edadMeses) {
        super(Nombre, edadMeses);
        this.Raza = Raza;
        this.Pedigree = Pedigree;
    }

    @Override
    public String toString() {
        return super.toString() + " \nGato: Raza: "+Raza+"  Pedigree: "+Pedigree;
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

}
