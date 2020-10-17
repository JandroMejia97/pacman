package personajes;

import java.util.*;

/**
 * Clase que modela las caracteristicas y el comportamiento general de una Entidad que puede ser representada visualmente sobre el Tablero
 * @author Carlos Alejandro Hernandez Mejia
 */
public abstract class Entidad {


    /**
     * Dimension de la Entidad
     */
    private int dimension;

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
     * @param dimension Dimension de la Entidad

     */
    public Entidad(String color, int dimension) {
        // TODO implement here
       
    }

    /**
     * Controla la colision de entidades
     */
    public void controlarColision() {
        // TODO implement here
       
    }

    public int getDimension() {
        return this.dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
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