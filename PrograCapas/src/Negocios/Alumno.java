/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

/**
 *
 * @author estudiante
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private int nota;
    private int nota2;
    private int nota3;
    public Alumno(){
        
    }
    public Alumno(String nombre,String apellidos,int nota,int nota2,int nota3){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nota=nota;
        this.nota2=nota2;
        this.nota3=nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
}
