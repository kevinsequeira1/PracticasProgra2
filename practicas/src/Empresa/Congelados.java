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
    public void cAire(int n,int o,int c,int v){
        System.out.println("congelado´por aire porcentaje de nitrogeno %"+n+" porcentaje de oxigeno %"+o+" pocentaje de carbono %"+c+" porcentaje de v´por de agua %"+v);
    }
    public void cAgua(int g){
        System.out.println(" congelado por agua salinidad="+g+" gramos de sal por litro de agua");
        
    }
    public void cNitrogeno(int t){
        System.out.println("congelado por nitrogeno tiempo de exposicion al nitrogeno "+t+" segundos");
        
    }
    public void fechaEnvasado(int dia,int mes,int ano){
        
        System.out.println("fecha de envasado= "+dia+"/"+mes+"/"+ano);
    }
}
