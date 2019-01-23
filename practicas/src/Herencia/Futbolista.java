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
public class Futbolista extends Futbol{
    int dorsal;
    String demarcacion;
    public Futbolista(int dorsal,String demarcacion,int id,String nombre,String apellidos,int edad){
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    public String getAtributos(){
        return "id "+id+" nombre "+nombre+" apellidos "+apellidos+" edad "+edad+" dorsal "+" demarcacion "+demarcacion;
        
    }
     public void jugarPartido(){
         System.out.println("partid jugado");
        
     }
     public void getentrenar(){
         System.out.println("entrenado siempre");
        
     }
     public void jugar(Futbol futbol){
         futbol.concentrarse();
         futbol.viajar();
     }
}
