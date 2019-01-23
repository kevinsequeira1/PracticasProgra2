/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author MONGE
 */
public class Main {
    public static void main(String[] args) {
        Productos pro=new Productos(0,0,0,0,null);
        Productos fresh=new Frescos("españa",04,2010,05,67);
        Productos refri=new Refrigerados(789,5,2010,9,89,"brazil");
        Productos conge=new Congelados(45,5,2010,9,66,"zuisa");
        
        pro.tipo("frescos");
        System.out.println(fresh.getAtributos());
        fres((Frescos) fresh);
        System.out.println("");
        pro.tipo("refrigerados");
        System.out.println(refri.getAtributos());
        refri((Refrigerados) refri);
        System.out.println("");
        pro.tipo("congelados");
        System.out.println(conge.getAtributos());
        conge((Congelados) conge);
        
    }
    public static void fres(Frescos fres){
        fres.fechaEnvasado(21, 03, 2019);
        
    }
    public static void refri(Refrigerados refri){
    refri.fechaEnvasado(31, 04, 2019);
    
        
    }
    public static void conge(Congelados conge){
        conge.cAgua(45);
        conge.cAire(34, 43, 54, 43);
        conge.fechaEnvasado(21, 01, 2019);
        
    }
}
