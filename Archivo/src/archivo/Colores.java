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
    public void Emarcas() throws IOException{
         while (true) {
            String a = JOptionPane.showInputDialog(("digite marca"));
             int b = Integer.parseInt(JOptionPane.showInputDialog("digite "));
            lo.setMarca(a);
            lo.getMarca();
            
            for (int i = 0; i < matriz.length; i++) {
                if(matriz[i]==null){
                    matriz[i]=new Logica(a);
                    
                    break;
                }
                
            }
         }
         
       
    }
    public  void Earchivo(){
        try{
        File archivo = new File("Lista.txt");
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i <matriz.length; i++) {
                if (matriz[i] != null) {

                    bw.write(matriz[i].getMarca() + ", ");

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
    public void Lmarcas() {
        for (int i = 0; i <matriz.length; i++) {
            if (matriz[i] != null) {
                System.out.println(matriz[i].getMarca());

            }

        }
        
    }
    public void Larchivo(){
         
         
        try {
            FileReader archivo1 = new FileReader("Lista.txt");
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
