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
public class Masajista extends Futbol{
    String titulacion;
    int anosExperiencia;
    public Masajista(String titulacion,int anosExperiencia,int id,String nombre,String apellidos,int edad){
        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }
    public String getAtributos(){
        return "id "+id+" nombre "+nombre+" apellidos "+apellidos+" edad "+edad+" titulacion "+titulacion+" años de experiencia "+anosExperiencia;
        
    }
    public void darMasaje(){
        System.out.println("aplicando masage");
    }
    public void masaje(Futbol futbol){
         futbol.concentrarse();
         futbol.viajar();
     }
}
