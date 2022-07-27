/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosFundamentales.servicios;

import EjerciciosFundamentales.entidades.Enumeraciones.PerroTamanio;
import EjerciciosFundamentales.entidades.Perro;
import java.util.Scanner;

public class PerroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        Perro p = new Perro();
        
        System.out.println("Vamos a añadir a un perro.");
        System.out.println("Por favor ingrese los siguientes datos:");
        System.out.println("Nombre:");
        p.setNombre(leer.next());
        System.out.println("Raza:");
        p.setRaza(leer.next());
        System.out.println("Edad:");
        p.setEdad(leer.nextInt());
        System.out.println("Tamaño:");
        p.setTamanio(PerroTamanio.CHICO);
        
        return p;
        
    }
    
    public void mostrarPerro(Perro p){
        System.out.println(p.toString());
    }
}
