package pacman;

import java.util.*;

/**
 * Clase que representa cada uno de los niveles del juego
 * @author Carlos Alejandro Hernández Mejía
 */
public class Nivel {

    /**
     * Numero del nivel
     */
    private int numero;

    /**
     * Velocidad base del nivel
     */
    private int velocidadBase;

    /**
     * Tablero del juego
     */
    private Tablero tablero;

    /**
     * Default constructor
     */
    public Nivel() {
    }

    /**
     * Constructor con parámetros
     * @param num Numero del nivel
     * @param vel Velocidad base
     */
    public Nivel(int num, int vel) {
        // TODO implement here
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVelocidadBase() {
        return this.velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

}