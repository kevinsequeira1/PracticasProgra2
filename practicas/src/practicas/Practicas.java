/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su dia de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su mes de nacimiento:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento:"));
        System.out.println(dia + "/" + mes + "/" + ano);
        int suma = dia + mes + ano;
        System.out.println(suma);
        int resultado=0;
        while(suma>0){
            resultado+=suma%10;
            suma=suma/10;
            
        }
        System.out.println("el numero de la suerte es "+resultado);
    }

}
