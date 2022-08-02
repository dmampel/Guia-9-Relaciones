/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales.mains;

import Entidades.Baraja;
import Entidades.Carta;
import Servicios.BarajaServicio;
import Servicios.CartaServicio;
import java.util.HashSet;

/**
 *
 * @author Delfina
 */
public class ejercicio3 {

    public static void main(String[] args) {
        
        CartaServicio cartaServicio = new CartaServicio();
        HashSet<Carta> cartas = cartaServicio.crearCarta();
        
        BarajaServicio barajaServicio = new BarajaServicio();
        Baraja baraja = barajaServicio.crearBaraja(cartas);
        
        barajaServicio.siguienteCarta(cartas);
        System.out.println(".........");
       
        
    }
    
}
