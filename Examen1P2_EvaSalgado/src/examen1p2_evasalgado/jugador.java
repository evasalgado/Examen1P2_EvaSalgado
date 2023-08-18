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
public class jugador {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private String piehabil;
    private int rating;
    ArrayList<equipo> E = new ArrayList<>();
    private int Agarre;
    private int Lanzamiento;
    private int passing;
    private int fisico;
    private int ritmo;
    private int entrada;
    private int vision;
    private int disparo;
    private int Regate;

    public jugador() {
    }

    public jugador(int Agarre, int Lanzamiento, int passing) {
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.passing = passing;
    }
    
    public jugador(String nombre, int edad, String nacionalidad, String piehabil, int rating, int Agarre, int Lanzamiento, int passing, int fisico, int ritmo, int entrada, int vision, int disparo, int Regate) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.piehabil = piehabil;
        this.rating = rating;
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.passing = passing;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.disparo = disparo;
        this.Regate = Regate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPiehabil() {
        return piehabil;
    }

    public void setPiehabil(String piehabil) {
        this.piehabil = piehabil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<equipo> getE() {
        return E;
    }

    public void setE(ArrayList<equipo> E) {
        this.E = E;
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {
        this.Agarre = Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(int Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    public int getRegate() {
        return Regate;
    }

    public void setRegate(int Regate) {
        this.Regate = Regate;
    }

    
    
}
