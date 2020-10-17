package core;

import java.util.*;

/**
 * Posicion sobre el plano cartesiano
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Posicion {
    /**
     * Coordenada sobre el eje X
     */
    private int x;

    /**
     * Coordenada sobre el eje Y
     */
    private int y;

    /**
     * Default constructor
     */
    public Posicion() {
    }

    /**
     * Posicion sobre el plano cartesiano
     * @param x Coordenada sobre el eje X
     * @param y Coordenada sobre el eje Y
     */
    public Posicion(int x, int y) {
        // TODO implement here
       
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}