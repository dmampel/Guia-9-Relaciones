package PrimerosPasos;

import PrimerosPasos.entidades.Dni;
import PrimerosPasos.entidades.Persona;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delfina
 */
public class ej1 {

    public static void main(String[] args) {
        
        
        Dni dni = new Dni();
        dni.setNumero(43484771);
        Persona p = new Persona("delfina", "mampel", dni);
        System.out.println(p.toString());
        
        
    }
    
}
