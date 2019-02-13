/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choferes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author estudiante
 */
public class Guardar {
    
    public Guardar(){
        
    }
    public  void Earchivo(String recibo) throws IOException{
        recibo="";
        try{
        File archivo = new File("chofer.txt");
        FileWriter fw = null;
        BufferedWriter bw;
        if (archivo.exists()) {
           fw = new FileWriter(archivo.getAbsoluteFile(), true); 
            bw = new BufferedWriter(new FileWriter(archivo));
            

                    bw.write(recibo);

        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
        fw.close();
       }catch(IOException e){
           
       }
    }
    
    public void Larchivo(String ver){
         
         
        try {
            try (FileReader archivo1 = new FileReader("chofer.txt")) {
                BufferedReader br = new BufferedReader(archivo1);
                String cadena;
                while ((cadena = br.readLine()) != null) {
                    ver="" + cadena;
                    
                }
            }
        } catch (IOException ex) {

        }
        
    }
}
