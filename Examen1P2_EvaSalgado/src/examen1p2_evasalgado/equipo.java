/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_evasalgado;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author evaja
 */
public class equipo {
    private String nombre; 
    private String pais; 
    private int Rating;
    private ArrayList <Integer> plantilla = new ArrayList<>();

    public equipo() {
    }

    public equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        Random alea = new Random();
        Rating=alea.nextInt(1,4);
        this.Rating = Rating;
    }

    public ArrayList<Integer> getPlantilla() {
        return plantilla;
    }
    @Override
    public String toString() {
        return "equipo{" + "nombre=" + nombre + ", pais=" + pais + ", Rating=" + Rating + ", plantilla=" + plantilla ;
    }
    public void setPlantilla(ArrayList<Integer> plantilla) {
        if (plantilla.size()<=4) {
            this.plantilla = plantilla;
        } else {
            JOptionPane.showMessageDialog(null, "Numero de jugadores no puede ser mayor a 4");
        }
    }

    
    
   
}
