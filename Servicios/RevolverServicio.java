/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Revolver;

public class RevolverServicio {

    public Revolver llenarRevolver() {

        Revolver revolver = new Revolver();
        revolver.setPosicionActual((int) (Math.random() * 6));
        revolver.setPosicionAgua((int) (Math.random() * 6));

        return revolver;
    }

    public boolean mojar(Revolver revolver) {

        boolean var;

        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            var = true;
        } else {
            var = false;
        }

        return var;

    }

    public void siguienteChorro(Revolver revolver) {
        
        JugadorServicio js = new JugadorServicio();
        
        if (revolver.getPosicionActual() < js.jugadores.size()) {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        } else {
            revolver.setPosicionActual(1);
        }
    }

    public void mostrarInfo(Revolver revolver) {

        System.out.println("Posicion Actual: " + revolver.getPosicionActual());
        System.out.println("Posicion del agua: " + revolver.getPosicionAgua());
    }
}
