package comestibles;

import java.util.*;
import personajes.Entidad;

/**
 * Clase que modela las caracteristicas y el comportamiento general de un Comestible
 * @author Carlos Alejandro Hernandez Mejia
 */
public abstract class Comestible extends Entidad {

    /**
     * Puntos que acumula Pacman al comer este comestible
     */
    private int puntos;


    /**
     * Default constructor
     */
    public Comestible() {
    }

    /**
     * Constructor
     * @param puntos Puntos que acumula Pacman al comer este comestible
     */
    public Comestible(int puntos) {
        // TODO implement here
        
    }

    /**
     * Se ejecuta cuando Pacman se posiciona sobre la celda que lo contiene contiene.
     */
    public void consumir() {
        // TODO implement here
       
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}