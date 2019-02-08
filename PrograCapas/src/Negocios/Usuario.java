/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.Info;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Usuario {
   private String usuario="kevin";
   private String contra="1234";
   private boolean user;
   public Usuario(){
       
   }
   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
   
}
