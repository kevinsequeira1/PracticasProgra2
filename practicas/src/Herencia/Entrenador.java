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
public class Entrenador extends Futbol{
    String federacion;
    public Entrenador(String federacion,int id,String nombre,String apellidos,int edad){
        super(id, nombre, apellidos, edad);
        this.federacion=federacion;
        
    }
    public String getAtributos(){
        return "id "+id+" nombre "+nombre+" apellidos "+apellidos+" edad "+edad+" federacion "+federacion;
        
    }
    public void dirigirPartido(){
        System.out.println("entrenando");
        
        
    }
    public void dirigirEntrenamiento(){
        System.out.println("dirigiendo entrenamiento");
        
    }
    public void juego(Futbol futbol){
         futbol.concentrarse();
         futbol.viajar();
     }
}
