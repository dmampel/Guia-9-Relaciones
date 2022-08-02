/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import java.util.HashSet;

public class CartaServicio {

    public HashSet<Carta> crearCarta() {

        HashSet<Carta> cartas = new HashSet();

        for (int cont = 0; cont < 13; cont++) {

            if (cont != 0 & cont != 8 & cont != 9) {
                Carta c = new Carta();
                c.setNumero(cont);
                c.setPalo("Basto");
                cartas.add(c);
            }

        }

        for (int cont = 0; cont < 13; cont++) {

            if (cont != 0 & cont != 8 & cont != 9) {
                Carta c = new Carta();
                c.setNumero(cont);
                c.setPalo("Espada");
                cartas.add(c);
            }

        }

        for (int cont = 0; cont < 13; cont++) {

            if (cont != 0 & cont != 8 & cont != 9) {
                Carta c = new Carta();
                c.setNumero(cont);
                c.setPalo("Copa");
                cartas.add(c);
            }

        }

        for (int cont = 0; cont < 13; cont++) {

            if (cont != 0 & cont != 8 & cont != 9) {
                Carta c = new Carta();
                c.setNumero(cont);
                c.setPalo("Oro");
                cartas.add(c);
            }

        }

        return cartas;
    }
}
