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
public class Refrigerados extends Productos{
    int codigo;
    public Refrigerados(int codigo,int dia,int mes,int ano,int lote,String origen){
        super(dia,mes ,ano,lote,origen);
        this.codigo=codigo;
    }
    public String Atributos(){
        return "fecha de caducidad "+dia+"/"+mes+"/"+ano+"lote "+lote+"codigo de supervision "+codigo;
    }
}
