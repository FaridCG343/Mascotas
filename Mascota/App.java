/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

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
                opc = JOptionPane.showInputDialog(null, "Bienvenido =D\n¿Qué desea hacer?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Alta", "Adoptar", "Imprimir mascotas", "Salir"}, "Alta").toString();
            } catch (Exception error) {
                opc = "Salir";
            }
            switch (opc) {
                case "Alta":
                    altas();
                    break;
                case "Adoptar":
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
        int lugar=-1, confirmar;
        String opc,opc2;
        try {
            opc = JOptionPane.showInputDialog(null, "¿Tiene algun inconveniente con adoptar un perro?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si").toString();
        } catch (Exception error) {
            opc = "";
        }//fin try cancelar
        try {
            opc2 = JOptionPane.showInputDialog(null, "¿Tiene algun inconveniente con adoptar un gato?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si").toString();
        } catch (Exception error) {
            opc2 = "";
        }//fin try cancelar
        if(!opc.equals("")||!opc2.equals("")){
            if(opc.equals("Si")){
                for(int i=0;i<arrayGen.size();i++){
                    if((arrayGen.get(i).getClass().getName()).equals("Mascota.Gatos")){
                        lugar=i;
                        i=arrayGen.size();
                    }//fin if obtener primer perro
                }//fin for loop 
            }//fin if elije perro
            if(opc2.equals("Si")){
                for(int i=0;i<arrayGen.size();i++){
                    if((arrayGen.get(i).getClass().getName()).equals("Mascota.Perros")){
                        lugar=i;
                        i=arrayGen.size();
                    }//fin if obtener primer gato
                }//fin for loop
            }//fin if elije gato
            if(opc.equals("No")&&opc2.equals("No")){
                lugar=0;
            }
            if(lugar==-1){
                JOptionPane.showMessageDialog(null, "No hay mascotas disponibles :(");
            }else{
                confirmar=JOptionPane.showConfirmDialog(null, "Estas a punto de adoptar a \n"+arrayGen.get(lugar), "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirmar==0){
                JOptionPane.showMessageDialog(null, "Felicidades adoptaste a \n"+arrayGen.get(lugar));
                arrayGen.remove(lugar);
            }
            }
        }//fin si le da cancelar 
    }//fin bajas

    public static void imprimir() {
        for (int i = 0; i < arrayGen.size(); i++) {
            JOptionPane.showMessageDialog(null, "Lugar " + (i + 1) + arrayGen.get(i));
        }//fin for para imprimir mascotas
    }//fin imprimir()
}//fin app()
