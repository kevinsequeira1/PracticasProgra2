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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        String numDivisores = "(";
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
        for (int i = 1; i < (numero); i++) {
            cont+=i;
         
    }
      if(cont==numero){
                System.out.println("es perfecto");
            }
      else if(cont!=numero){
                System.out.println("no es perfecto");
            }  
    }
}
