/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author estudiante
 */
public class MundoFutbol {
    
    public static void main(String[] args) {
        Futbol jugar=new Futbol(255555,"kevin","sequeira",22);
        
        Futbol jugador=new Futbolista(7,"delantero",2577,"pedro","lumbi",22);
        Futbol entrenador=new Entrenador("costarrisence",2599,"kevin","sequeira",77);
        Futbol masajista=new Masajista("licenciado en masaje",34,2566555,"rojer ","mora",42);
         
        System.out.println(jugador.getAtributos()+"\n");
        jugando((Futbolista) jugador);
        System.out.println("");
        System.out.println(entrenador.getAtributos());
        entrenar((Entrenador) entrenador);
        System.out.println("");
        System.out.println(masajista.getAtributos());
        masaje((Masajista) masajista);
        
        
    }
    public static void jugando(Futbolista futbol){
            futbol.getentrenar();
            futbol.jugarPartido();
            futbol.jugar(futbol);
            
            
        }
    public static void entrenar(Entrenador entrenando){
        entrenando.dirigirEntrenamiento();
            entrenando.dirigirPartido();
            entrenando.juego(entrenando);
            
    }
    public static void masaje(Masajista masaje){
        masaje.darMasaje();
        masaje.masaje(masaje);
    }
}
