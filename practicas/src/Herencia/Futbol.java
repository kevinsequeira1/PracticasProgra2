/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author estudiante
 */
public class Futbol {
     int id;
     String nombre;
     String apellidos;
     int edad;
    public Futbol(int id,String nombre,String apellidos,int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public String getAtributos(){
         return "";
        
    }
    public void concentrarse(){
        System.out.println("consentrado");
    }
    public void viajar(){
        System.out.println("viajar a europa");
    }
}
