/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

public class BarajaComparadores {
    
    
    
    public static Comparator<Carta> compararPalo = new Comparator<Carta>(){
        @Override
        public int compare(Carta t, Carta t1) {
            return t.getPalo().compareTo(t1.getPalo());
        }
        
    };
}
