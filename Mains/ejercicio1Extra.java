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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        PersonaServicio personaServicio = new PersonaServicio();
        personas = personaServicio.fabricaPersonas(4);

        System.out.println("");
        PerroServicio perroServicio = new PerroServicio();
        perros = perroServicio.fabricaPerros(8);

        System.out.println("Lista de Perros:");
        for (Perro aux : perros) {
            System.out.println(aux.getNombre());
        }

        System.out.println("Lista de Personas:");
        for (Persona aux : personas) {
            System.out.println(aux.getNombre());
            System.out.println("Qué perro te gustaría adoptar?");
            int perro = leer.nextInt();
            if (perros.get(perro).getDueño() == false) {
                aux.setMascota(perros.get(perro));
                perros.get(perro).setDueño(true);
                System.out.println("Ok, el perro es tuyo.");
                aux.setMascota(perros.get(perro));

            } else {
                System.out.println("El perro ya tiene dueño");
            }
        }

        Iterator<Perro> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().getDueño() == true) {
                it.remove();
            }
        }

        System.out.println("Lista actualizada:");
        for (Perro var : perros) {
            System.out.println(var.getNombre());
        }

        System.out.println("Lista de correspondencia.");
        for (Persona var : personas) {
            System.out.println(var.getNombre());
            System.out.println(var.getMascota());
        }

    }
}
