/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_evasalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class estadio {
    private String nombre;
    private String ciudad;
    private int Capacidad;
    ArrayList<equipo> e = new ArrayList<>();

    public estadio() {
    }

    public estadio(String nombre, String ciudad, int Capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.Capacidad = Capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public ArrayList<equipo> getE() {
        return e;
    }

    public void setE(ArrayList<equipo> e) {
        this.e = e;
    }
    
   
}
