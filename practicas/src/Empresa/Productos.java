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
public class Productos {
    int dia;
    int mes;
    int ano;
    int lote;
    String origen;
    public Productos(int dia,int mes,int ano,int lote,String origen){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.lote=lote;
        this.origen=origen;
    }
    public String getAtributos(){
        return "";
        
    }
    public void fechaEnvasado(int dia,int mes,int ano){
        
        System.out.println("fecha de envasado= "+dia+"/"+mes+"/"+ano);
    }
    public void tipo(String tipo){
        System.out.println("producto "+tipo);
    }
}
