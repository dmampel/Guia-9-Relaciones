/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import EjerciciosFundamentales.entidades.Utilidades.PerroTamanio;
import Entidades.Perro;
import java.util.ArrayList;
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
    
    public ArrayList<Perro> fabricaPerros(int cantidad){
        
        ArrayList<Perro> perros = new ArrayList();
        
        for (int cont = 0; cont < cantidad; cont++) {
            Perro p = new Perro();
            p.setNombre("perro " +cont);
            p.setDueño(false);
            perros.add(p);
            
        }
        return perros;
    }
}
