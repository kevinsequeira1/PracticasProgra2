/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
//mmn

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Logica logica = new Logica();
        App:
        while (true) {

            int menu = Integer.parseInt(JOptionPane.showInputDialog("bienbenido introduzca un numero segun su preferencia\n #1 juego de adivinar\n :"
                    + "                                             #2 registro de nombre y edad\n  #3 para ver si las palabras riman\n #4 salir"));
            switch (menu) {
                case 1:

                    System.out.println("bienbenido al juego de adivinar tienes 5 intentos");
                    int numero = (int) (Math.random() * 20);

                    int entrada = -1;
                    int contador = 0;

                    do {

                        entrada = logica.adivinar();

                        if (entrada > numero) {
                            System.out.println("El numero es menor\n");
                        } else if (entrada < numero) {
                            System.out.println("El numero es mayor\n");
                        }
                        contador++;
                        if (contador == 5) {
                            System.out.println("Has perdido en " + contador + " intentos.\n");
                            break;
                        } else if (entrada == numero) {
                            System.out.println("Has acertado en " + contador + " intentos.\n");

                        } else if (entrada != numero) {
                            for (int i = 0; i < 5; i++) {
                                int intentos = 5 - contador;
                                System.out.println("quedan " + intentos + " intentos\n");
                                break;
                            }
                        }
                    } while (entrada != numero);
                case 2:
                    System.out.println("Bienbenido a registro ");

                    Logica matriz[][] = new Logica[2][2];
                    
                    String nombre;
                    int edad;
                    Scanner info=new Scanner(System.in);
                    for (int f = 0; f <2; f++) {
                        for (int c = 0; c <2; c++) {
                            System.out.println("introduzca un nombre ");
                            nombre=info.nextLine();
                            System.out.println("introduzca una edad ");
                            edad=info.nextInt();
                            info.nextLine();
                            Logica datos=new Logica(nombre,edad);
                            matriz[f][c]=datos;
                        }
                    }
                    for (int f = 0; f <2; f++) {
                        for (int c = 0; c <2; c++) {
                            System.out.println("nombre "+matriz[f][c].getNombre()+"edad "+matriz[f][c].getEdad());
                        }
                    }
                case 3:
                    
                    String a = (JOptionPane.showInputDialog("digite la primera palabra "));
                    ;
                    String b = (JOptionPane.showInputDialog("digite la segunda palabra "));
                    ;
                    String cadena1 = new String(a);
                    String cadena2 = new String(b);
                    if (cadena1.equals(cadena2)) {
                        System.out.println("si riman");
                    }else{
                        System.out.println("no riman");
                    }
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "gracias ");
			break;
		default:
			JOptionPane.showMessageDialog(null, menu + " no es una opción válida");
			break;
            }
    }
}
}