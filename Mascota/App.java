/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author farid
 */
public class App {

    static ArrayList<Mascota> arrayGen = new ArrayList();

    public static void main(String[] args) {
        String opc;
        do {
            try {
                opc = JOptionPane.showInputDialog(null, "Bienvenido =D\n¿Qué desea hacer?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Alta", "Baja", "Imprimir mascotas", "Salir"}, "Alta").toString();
            } catch (Exception error) {
                opc = "Salir";
            }
            switch (opc) {
                case "Alta":
                    altas();
                    break;
                case "Baja":
                    bajas();
                    break;
                case "Imprimir mascotas":
                    imprimir();
                    break;
                case "Salir":
                    break;
            }//fin switch
        } while (!opc.equals("Salir"));
    }//fin main

    public static void altas() {
        String opc;
        try {
            opc = JOptionPane.showInputDialog(null, "¿Qúe tipo de mascota va a ingresar?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Perro", "Gato"}, "Perro").toString();
        } catch (Exception error) {
            opc = "";
        }//fin try cancelar
        if (!opc.equals("")) {
            String nombre, raza;
            int edad ;
            String pedigree1;
            boolean pedigree = false;
            nombre = JOptionPane.showInputDialog("Nombre:");
            if (nombre == null||nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Nombre no valido");
            } else {
                raza = JOptionPane.showInputDialog("Raza:");
                if (raza == null||raza.equals("")) {
                    JOptionPane.showMessageDialog(null, "Raza no valida");
                } else {
                    try {
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad en meses:"));
                    } catch (Exception error) {
                        edad=0;
                    }
                    if (edad <=0) {
                        JOptionPane.showMessageDialog(null, "Edad no valida");
                    } else {
                        try {
                            pedigree1 = JOptionPane.showInputDialog(null, "¿Pedigree?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si").toString();
                        } catch (Exception error) {
                            pedigree1="";
                        }
                        if(pedigree1.equals("")){
                            JOptionPane.showMessageDialog(null, "Pediree no valida");
                        }else{
                            if (pedigree1.equals("Si")) {
                            pedigree = true;
                        }
                        switch (opc) {
                            case "Perro":
                                Perros Gen = new Perros(raza, pedigree, nombre, edad);
                                arrayGen.add(Gen);
                                break;
                            case "Gato":
                                Gatos Gen2 = new Gatos(raza, pedigree, nombre, edad);
                                arrayGen.add(Gen2);
                                break;
                        }//fin switch
                        }//fin if pedigree
                    }//fin if edad
                }//fin if raza
            }//fin if nombre
        }//fin if verificar
    }//Fin altas()

    public static void bajas() {
        int lugar = 1, confirmar;
        boolean salir = false;
        imprimir();
        do {
            try {
                lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el lugar a dar de baja"));
            } catch (Exception error) {
                salir = true;
            }//fin try cancelar
            if (lugar <= 0 || lugar > arrayGen.size()) {
                JOptionPane.showMessageDialog(null, "Ingresa un lugar valido");
            }//fin if aviso
        } while ((lugar <= 0 || lugar > arrayGen.size()) && salir == false);//fin do while validar lugar
        if (salir == false) {
            confirmar = JOptionPane.showConfirmDialog(null, "Seguro que quieres dar de baja a:\n" + arrayGen.get(lugar - 1), "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmar == 0) {
                arrayGen.remove(lugar - 1);
                imprimir();
            }//fin if confirmar
        }//fin if verificar
    }//fin bajas

    public static void imprimir() {
        for (int i = 0; i < arrayGen.size(); i++) {
            JOptionPane.showMessageDialog(null, "Lugar " + (i + 1) + arrayGen.get(i));
        }//fin for para imprimir mascotas
    }//fin imprimir()
}//fin app()
