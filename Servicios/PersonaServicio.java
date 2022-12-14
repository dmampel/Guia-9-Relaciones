/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona p = new Persona();
        System.out.println("Ingrese su nombre.");
        p.setNombre(leer.next());
        System.out.println("Ahora su apellido.");
        p.setApellido(leer.next());
        System.out.println("Cuantos años tiene?");
        p.setEdad(leer.nextInt());
        System.out.println("Su número de DNI.");
        p.setDni(leer.nextInt());
        
        return p;

    }
    
    public void asignarMascota(Perro perro, Persona persona){
        
        persona.setMascota(perro);
    }
    
    public void mostrarPersona(Persona p){
        
        System.out.println(p.toString());
        
    }
    
    public ArrayList<Persona> fabricaPersonas(int cantidad){
        
        ArrayList<Persona> personas = new ArrayList();
        for (int cont = 0; cont < cantidad; cont++) {
            Persona p = new Persona();
            p.setNombre("persona " +(cont + 1));
            
            personas.add(p);
        }
        
        return personas;
    }

}
