/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
//mnmn
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Logica logica = new Logica();
        while (true) {

            int menu = Integer.parseInt(JOptionPane.showInputDialog("bienbenido introduzca un numero segun su preferencia\n #1 juego de adivinar\n :"
                    + "                                             #2 registro de nombre y edad :"));
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

                    while (true) {
                        int digite = Integer.parseInt(JOptionPane.showInputDialog("digite #1 para rgistrar personas o 2 para salir "));

                        if (digite == 1) {
                            String nombre = (JOptionPane.showInputDialog("digite el nombre "));
                            logica.setNombre(nombre);
                            logica.getNombre();
                            int edad = Integer.parseInt(JOptionPane.showInputDialog("digite la edad "));
                            logica.setEdad(edad);
                            logica.getEdad();

                            for (int f = 0; f < matriz.length; f++) {
                                for (int c = 0; c < matriz[f].length; c++) {
                                    if (matriz[f][c] == null) {
                                        matriz[f][c] = new Logica(nombre, edad);
                                    }
                                }

                            }

                        } else {
                            for (int f = 0; f < matriz.length; f++) {
                                for (int c = 0; c < matriz[f].length; c++) {

                                    System.out.print(matriz[f][c]);
                                    if (c != matriz[f].length - 1) {
                                        System.out.print("\t");
                                    }

                                }
                            }
                            break;
                        }
                    }

            }
        }

    }
}
