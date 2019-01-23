/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author estudiante
 */
public class Frescos extends Productos{
    
public Frescos(String origen,int dia,int mes,int ano,int lote){
    super(dia,mes ,ano,lote,origen);
    
}
public String getAtributos(){
        return "fecha de caducidad "+dia+"/"+mes+"/"+ano+" pais de origen "+origen;
    
}
}
