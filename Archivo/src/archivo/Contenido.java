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
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Contenido {
        private String color;
        private String marca;
        private String  placa;
        private String placa2;
        private String modelo;
        private String vel;
        private String  archivo;
        private String ruta;
        private String ver;
        Logica lo=new Logica();
        Logica[] lista=new Logica[1000];
        
        
    public Contenido(){
        
    }
    public void Emarcas() throws IOException{
         while (true) {
            String a = "";
            
            lo.setMarca(a);
            lo.getMarca();
            
            for (int i = 0; i < lista.length; i++) {
                if(lista[i]==null || lista[i]!=null){
                    lista[i]=new Logica(a);
                    
                    break;
                }
                
            }
            if(a.equals("a")){
                    break;
                }
         }
         
       
    }
    public  void Earchivo(){
        try{
        File archivo = new File("Lista.txt");
        FileWriter fw = null;
        BufferedWriter bw;
        if (archivo.exists()) {
           fw = new FileWriter(archivo.getAbsoluteFile(), true); 
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
        fw.close();
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


    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVel() {
        return vel;
    }

    public void setVel(String vel) {
        this.vel = vel;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca2() {
        return placa2;
    }

    public void setPlaca2(String placa2) {
        this.placa2 = placa2;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
   

    public void Crear(){
        File creaRuta=new File(ruta);
        File creaArchivo=new File(ruta+archivo);
        try{
        creaRuta.mkdirs();
        Formatter crea=new Formatter(ruta+archivo);
        crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s ","placa= "+placa+"-"+placa2,"modelo= "+modelo,"velocidad = "+vel,"marca="+marca,"color="+color);
        crea.close();
            System.out.println("archivo creado ");
        }catch(Exception e){
            System.out.println("no se pudo");
        }
    }
    
}
