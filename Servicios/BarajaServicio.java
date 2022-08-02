/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Baraja;
import Entidades.BarajaComparadores;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Delfina
 */
public class BarajaServicio {
    
    public Baraja crearBaraja(HashSet<Carta> cartas){
        
        Baraja b = new Baraja();
        b.setCartas(cartas);
        
       return b;
        
    }
    
    public void mostrarMazo(Baraja b){
        
        for (Carta aux : b.getCartas()) {
            System.out.println(aux);
        }
    }
    
    public void ordenarMazo(HashSet<Carta> cartas){
        //NO FUNCIONA LPM
        ArrayList<Carta> cartasArrayList = new ArrayList(cartas);
        Collections.sort(cartasArrayList, BarajaComparadores.compararPalo);
        
    }
    
    public void mezclar(HashSet<Carta> cartas){
        ArrayList<Carta> cartasArrayList = new ArrayList(cartas);
        Collections.shuffle(cartasArrayList);
        
    }
    
    public void siguienteCarta(HashSet<Carta> cartas){
        
        Iterator<Carta> it = cartas.iterator();
        
        for (Carta aux : cartas) {
            while (it.hasNext()){
                System.out.println(it.next());
            }
            
        }
        
    }
    
    
}

