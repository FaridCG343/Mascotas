/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

/**
 *
 * @author farid
 */
public class Mascota {

    protected String Nombre;
    protected int edadMeses;
    public Mascota() {
    }

    public Mascota( String Nombre, int edadMeses) {
        this.Nombre = Nombre;
        this.edadMeses = edadMeses;
    }

    @Override
    public String toString() {
        return " Nombre:"+Nombre+" Edad en meses:"+edadMeses;
    }
}
