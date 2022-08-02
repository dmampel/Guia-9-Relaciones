/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> jugadores = new ArrayList();

    public ArrayList<Jugador> crearJugador() {

        System.out.println("Cuantos jugadores son?");
        int numeroJugadores = leer.nextInt();

        for (int cont = 0; cont < numeroJugadores; cont++) {
            Jugador j = new Jugador();
            j.setId(cont);
            j.setNombre("Jugador " + j.getId());
            j.setMojado(false);
            jugadores.add(j);
        }

        return jugadores;
    }

    public boolean disparo(Revolver r, Jugador j) {

        RevolverServicio rs = new RevolverServicio();
        boolean var = rs.mojar(r);

        if (var == true) {
            j.setMojado(var);
        }
        rs.siguienteChorro(r);

        return var;
    }
}
