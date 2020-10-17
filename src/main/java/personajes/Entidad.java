package personajes;

import java.util.*;

/**
 * Clase que modela las características y el comportamiento general de una Entidad que puede ser representada visualmente sobre el Tablero
 * @author Carlos Alejandro Hernández Mejía
 */
public abstract class Entidad {


    /**
     * Tamaño de la Entidad
     */
    private int tamaño;

    /**
     * Color de la entidad
     */
    private String color;
    
    /**
     * Estado de la entidad, para mostrarlo visualmente
     */
    private Estado estado;

    /**
     * Default constructor
     */
    public Entidad() {
    }

    /**
     * Constructor
     * @param color Color de la Entidad
     * @param tamaño Tamaño de la Entidad

     */
    public Entidad(String color, int tamaño) {
        // TODO implement here
       
    }

    /**
     * Controla la colision de entidades
     */
    public void controlarColision() {
        // TODO implement here
       
    }

    public int getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


}