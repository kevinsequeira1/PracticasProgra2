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
import javax.swing.JOptionPane;

/**
 *
 * @author MONGE
 */
public class Colores {
    Logica lo=new Logica();
    Logica[] matriz=new Logica[1000];
    public Colores(){
        
    }
    public void Ecolor() throws IOException{
         while (true) {
            String a = JOptionPane.showInputDialog(("digite color"));
             int b = Integer.parseInt(JOptionPane.showInputDialog("digite "));
            lo.setColor(a);
            lo.getColor();
            
            for (int i = 0; i < matriz.length; i++) {
                if(matriz[i]==null){
                    matriz[i]=new Logica(a);
                    
                    break;
                }
                
            }
         }
         
       
    }
    public  void Earchivo2(){
        try{
        File archivo = new File("Lista2.txt");
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i <matriz.length; i++) {
                if (matriz[i] != null) {

                    bw.write(matriz[i].getColor() + ", ");

                }
            }

        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
       }catch(IOException e){
           
       }
    }
    public void Lcolor() {
        for (int i = 0; i <matriz.length; i++) {
            if (matriz[i] != null) {
                System.out.println(matriz[i].getColor());

            }

        }
        
    }
    public void Larchivo2(){
         
         
        try {
            FileReader archivo1 = new FileReader("Lista2.txt");
            BufferedReader br = new BufferedReader(archivo1);
            String cadena;
            while ((cadena = br.readLine()) != null) {
               System.out.println("" + cadena);
                
            }
            archivo1.close();
        } catch (Exception ex) {

        }
        
    }
}
