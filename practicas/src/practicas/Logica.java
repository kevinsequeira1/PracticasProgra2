/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Logica {
/**
 * contructor Logica
 * aqui se almacena toda la logica para la clase ejercicio 3
 */
    private String nombre;
    private int edad;
    
    public Logica() {
        nombre="";
        edad=0;
    }
    public Logica(String nombre ,int edad) {
         nombre = this.nombre;
         edad=this.edad;
    }
    
/**
 * aqui se adivina el numero 
 * @return el numero acertado
 */
    public int adivinar() {

        int num = 0;
        
        while (true) {
            try {

                int valor = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre el 0 y el 20 "));
                num = valor;

                if (valor < 0 || valor > 20) {
                    System.out.println("El numero tiene que estar entre el 0 y el 20");
                } else {

                    break;
                }
            } catch (InputMismatchException e) {

                System.out.println("El valor tiene que ser numerico...");

            }
        }
        return num;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String substring(int beginIndex, int endIndex){
        return null;
        
    }
    
    
}
