/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashSet;
import java.util.Objects;

public class Baraja {
    
    HashSet<Carta> cartas;

    public Baraja() {
    }

    public Baraja(HashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    public HashSet<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(HashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    
    
    
}
