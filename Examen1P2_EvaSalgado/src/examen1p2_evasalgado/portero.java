/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_evasalgado;

import java.util.Random;

/**
 *
 * @author evaja
 */
public class portero extends jugador{
    Random alea = new Random();
    public portero() {
        super();
    }


    public portero(int Agarre, int Lanzamiento, int passing) {
        super(Agarre, Lanzamiento, passing);
    }

    public portero(String nombre, int edad, String nacionalidad, String piehabil, int rating, int Agarre, int Lanzamiento, int passing, int fisico, int ritmo, int entrada, int vision, int disparo, int Regate) {
        super(nombre, edad, nacionalidad, piehabil, rating, Agarre, Lanzamiento, passing, fisico, ritmo, entrada, vision, disparo, Regate);
    }
    
}
