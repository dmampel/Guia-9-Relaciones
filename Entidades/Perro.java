package Entidades;

import EjerciciosFundamentales.entidades.Utilidades.PerroTamanio;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private PerroTamanio tamanio;
    private boolean dueño;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, PerroTamanio tamanio, boolean dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.dueño = dueño;
    }

    public boolean getDueño() {
        return dueño;
    }

    public void setDueño(boolean dueño) {
        this.dueño = dueño;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PerroTamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(PerroTamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ",\n raza=" + raza + ",\n edad=" + edad + ",\n tamanio=" + tamanio + '}';
    }

}
