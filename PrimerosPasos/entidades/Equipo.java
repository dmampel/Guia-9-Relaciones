package PrimerosPasos.entidades;

import java.util.List;



public class Equipo {

    private List<Jugador> jugadores;

    public Equipo() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
}
