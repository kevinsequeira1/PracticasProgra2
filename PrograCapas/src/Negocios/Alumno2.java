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
public class Alumno2 {
    
    private String nombre;
    private String apellidos;
    private int nota;
    private int nota2;
    private int nota3;
    private Alumno[] lista=new Alumno[10000000];
    public Alumno2(){
        
        
    }
    public void agregar(String resultado){
        
        resultado="";
        for (int i = 0; i <lista.length; i++) {
            if(lista[i]==null){
                lista[i]=new Alumno(nombre,apellidos,nota,nota2,nota3);
            }
        }
      
        
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
