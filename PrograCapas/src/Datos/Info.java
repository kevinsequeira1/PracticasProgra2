/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocios.Alumno;
import Negocios.Alumno2;
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
public class Info {
    //FileWriter fichero = new FileWriter("Link.txt",true);
    public Info(){
        
    }
    public void crear(){
        Alumno2 a=new Alumno2();
         try{
        
        File archivo = new File("datos.txt");
        FileWriter fw = null;
        BufferedWriter bw;
        if (archivo.exists()) {
           fw = new FileWriter(archivo.getAbsoluteFile(), true); 
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(lo.getUsuario()+lista.getContra());
            
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
        fw.close();
       }catch(IOException e){
           
       }
         
    }
    public void leer(){
         try {
            FileReader archivo1 = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo1);
            String cadena;
            while ((cadena = br.readLine()) != null) {
//               System.out.println("" + cadena);
              
            }
            archivo1.close();
        } catch (Exception ex) {

        }
        
    }
}
