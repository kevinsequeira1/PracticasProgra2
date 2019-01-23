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
public class Congelados extends Productos{
    int temperatura;
    public Congelados(int temperatura,int dia,int mes,int ano,int lote,String origen){
        
        super(dia, mes, ano,lote,origen);
        this.temperatura=temperatura;
    }
    public String getAtributos(){
        return "fecha de caducidad "+dia+"/"+mes+"/"+ano+"lote "+lote+"temperatura recomendada "+temperatura;
        
    }
    public void cAire(){
        
    }
    public void cAgua(){
        
    }
    public void cNitrogeno(){
        
    }
}
