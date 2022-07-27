/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosPasos;

import PrimerosPasos.entidades.Equipo;
import PrimerosPasos.entidades.Jugador;
import java.util.ArrayList;

public class ej2 {

    public static void main(String[] args) {
        
        Equipo e = new Equipo();
        ArrayList<Jugador> jugadores = new ArrayList();
        
        //for (int cont = 0; cont < 4; cont++) {
        //   Jugador j = new Jugador("raul", "estefano", "arquero", cont);
        //   jugadores.add(j);
        //}
        Jugador j1 = new Jugador("raul", "estefano", "arquero", 4);
        Jugador j2 = new Jugador("fabio", "rodriguez", "delantero", 50);
        Jugador j3 = new Jugador("carlos", "diorodo", "defensor", 66);
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        
        e.setJugadores(jugadores);
        System.out.println(e.getJugadores());
        
        
        
    }
    
}
