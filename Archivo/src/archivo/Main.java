/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Logica lo=new Logica();
        Logica[] marca=new Logica[100];
        while(true){
        String a=JOptionPane.showInputDialog(("digite marca"));
        String b=JOptionPane.showInputDialog(("digite "));
        lo.setMarca(a);
        lo.getMarca();
            for (int i = 0; i < marca.length; i++) {
                if (marca[i]==null) {
                    marca[i]=new Logica(a);
                }
                break;
            }
            File archivo = new File("marcas.txt");
            try (FileWriter archi = new FileWriter(archivo)) {
                archi.write(Arrays.toString(marca));

            } catch (IOException ex) {
                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (b.equals("parar")) {
                
                    BufferedWriter bw;
                        bw = new BufferedWriter(new FileWriter(archivo));
                        for (int i = 0; i <marca.length; i++) {
                            System.out.println(marca[i].getMarca());
                break;
            }
                        bw.close();
                    break;

        }
        
            }
        }
    }

        
    
    
        
    