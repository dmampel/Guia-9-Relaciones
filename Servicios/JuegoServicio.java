/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        Juego juego = new Juego();
        juego.setJugadores(jugadores);
        juego.setRevolver(r);

        return juego;
    }

    public void Ronda() {

        JuegoServicio js = new JuegoServicio();

        ArrayList<Jugador> jugadores = new ArrayList();

        JugadorServicio jugadorServicio = new JugadorServicio();
        jugadores = jugadorServicio.crearJugador();

        RevolverServicio revolverServicio = new RevolverServicio();
        Revolver revolver = revolverServicio.llenarRevolver();

        js.llenarJuego(jugadores, revolver);
        revolverServicio.llenarRevolver().setPosicionActual((int) (Math.random() * jugadores.size()));
        revolverServicio.llenarRevolver().setPosicionAgua((int) (Math.random() * jugadores.size()));
        revolverServicio.mostrarInfo(revolver);

        for (int cont = 0; cont < jugadores.size(); cont++) {

            jugadorServicio.disparo(revolver, jugadores.get(cont));
            if (jugadores.get(cont).isMojado() == true) {
                System.out.println(jugadores.get(cont).getNombre() + " HA PERDIDO.");
                System.out.println("Partida terminada.");
                break;

            } else {
                System.out.println(jugadores.get(cont).getNombre() + " no se ha mojado, siguiente.");
            }
        }

    }
}
