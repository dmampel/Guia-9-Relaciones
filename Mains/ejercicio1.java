/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroServicio;
import Servicios.PersonaServicio;

public class ejercicio1 {

    public static void main(String[] args) {
        
        PersonaServicio servicioPersona = new PersonaServicio();
        Persona persona1 = servicioPersona.crearPersona();
        System.out.println("..............");
        Persona persona2 = servicioPersona.crearPersona();
        
        PerroServicio servicioPerro = new PerroServicio();
        Perro perro1 = servicioPerro.crearPerro();
        System.out.println("..............");
        Perro perro2 = servicioPerro.crearPerro();
        
        servicioPersona.asignarMascota(perro1, persona1);
        servicioPersona.asignarMascota(perro2, persona2);
        
        servicioPersona.mostrarPersona(persona1);
        System.out.println("..............");
        servicioPersona.mostrarPersona(persona2);
    }
    
}
