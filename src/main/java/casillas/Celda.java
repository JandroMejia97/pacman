package casillas;

import comestibles.Comestible;
import core.Posicion;
import java.util.*;
import personajes.Entidad;

/**
 * Clase que modela las características y el comportamiento general de una Celda
 * @author Carlos Alejandro Hernández Mejía
 */
public abstract class Celda extends Entidad {

    /**
     * Atributo que indica si la celda es un obstaculo.
     */
    private boolean esObstaculo;

    /**
     * Posición de la celda en el plano cartesiano.
     */
    private Posicion posicion;

    /**
     * Comestible
     */
    private Comestible comestible;

    /**
     * Constructor por defecto
     */
    public Celda() {
    }

    /**
     * Constructor
     * @param c Comestible a colocar en la Celda
     */
    public Celda(Comestible c) {
        // TODO implement here
        
    }

    /**
     * Constructor
     * @param esObstaculo Atributo que indica si la celda es un obstaculo.
     */
    public Celda(boolean esObstaculo) {
        // TODO implement here
        
    }

    public boolean esObstaculo() {
        return this.esObstaculo;
    }

    public void setEsObstaculo(boolean esObstaculo) {
        this.esObstaculo = esObstaculo;
    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Comestible getComestible() {
        return this.comestible;
    }

    public void setComestible(Comestible comestible) {
        this.comestible = comestible;
    }

    /**
     * Indica si esta celda contiene un comestible.
     * @return true si hay un comestible, false en caso contrario
     */
    public boolean tieneComestible() {
        // TODO implement here
        return false;
    }


    /**
     * Se ejecuta para consumir el comestible y retorna el comestible consumido.
     * @return Comestible consumido
     */
    public Comestible consumirComestible() {
        // TODO implement here
        return null;
        
    }

}