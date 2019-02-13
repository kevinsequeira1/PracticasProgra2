/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

/**
 *
 * @author estudiante
 */
public class Content {
    private String nombre;
    private int cedula;
    private String tipot;
    private String tipoc;
    public Content(){
        
    }

    public Content(String nombre, int cedula, String tipot, String tipoc) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipot = tipot;
        this.tipoc = tipoc;
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
