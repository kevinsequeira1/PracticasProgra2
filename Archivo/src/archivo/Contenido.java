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
 * @author estudiante
 */
public class Contenido {
        private int b=0;
        
        Logica lo=new Logica();
        Logica[] lista=new Logica[1000];
        
    public Contenido(){
        
    }
    public void Emarcas() throws IOException{
         while (true) {
            String a = JOptionPane.showInputDialog(("digite marca"));
            b= Integer.parseInt(JOptionPane.showInputDialog("digite "));
            lo.setMarca(a);
            lo.getMarca();
            
            for (int i = 0; i < lista.length; i++) {
                if(lista[i]==null){
                    lista[i]=new Logica(a);
                    
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
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != null) {

                    bw.write(lista[i].getMarca() + ", ");

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
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i].getMarca());

            }

        }
        
    }
    public String Larchivo(){
        String a="";
        try {
            FileReader archivo1 = new FileReader("Lista.txt");
            BufferedReader br = new BufferedReader(archivo1);
            String cadena;
            while ((cadena = br.readLine()) != null) {
//                System.out.println("" + cadena);
                a=""+cadena;
            }
            archivo1.close();
        } catch (Exception ex) {

        }
        return a;
    }
    
}
