/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

import choferes.Guardar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author estudiante
 */
public class Info {
    Content[] s = new Content[1000000];
    String nombre;
    int cedula;
    String tipot;
    String tipoc;
    Guardar g=new Guardar();
    public Info() {

    }

    public void Emarcas() throws IOException {
        
            String a = "";
            Content c = new Content();
            
            for (int i = 0; i <s.length; i++) {
                if(s[i]==null){
                    s[i]=new Content(nombre,cedula,tipot,tipoc);
                     
        
                     g.Earchivo(s[i].getNombre()+s[i].getCedula()+s[i].getTipot()+s[i].getTipoc());
                    
                }
                                        break;
                }
            
          
    
    }
    public void Lmarcas() {
        for (int i = 0; i <s.length; i++) {
            if (s[i] != null) {
                g.Larchivo(s[i].getNombre()+s[i].getCedula()+s[i].getTipot()+s[i].getTipoc());

            }

        }
        
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTipot() {
        return tipot;
    }

    public void setTipot(String tipot) {
        this.tipot = tipot;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }
    
    
}
