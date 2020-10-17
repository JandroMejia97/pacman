package fantasmas;

import casillas.Celda;
import core.Posicion;
import java.util.*;
import personajes.Direccion;

/**
 * Inky, el "caprichoso" es una especificacion de un Fantasma, que tiene una estrategia especifica para atrapar a Pacman
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Inky extends Fantasma {

    /**
     * Default constructor
     */
    public Inky() {
        super();
    }

    /**Uibicacion de Blinky
     * Se ejecuta hasta que Pacman consigue 30 puntos.
     * @param celda objetivo
     * @param celBlinky celda en la que se encuentra Blinky
     */
    public void salirDeCasa(Posicion celda, Celda celBlinky) {
        // TODO implement here
    }

    /**
     * Inky considera una posicion 2 casilleros delante de Pacman, y la posicion de Blinky, y traza un vector, y duplica su distancia.La celda determinada se Asigna a la celdaObjectivo.
     * @param celPacman Celda en la que se encuentra Pacman
     * @param celBlinky Posicion de Blinky
     * @return Direccion en la que se desplazara
     */
    public Direccion encontrarAPacman(Celda celPacman, Celda celBlinky) {
        // TODO implement here
        return null;
    }

    /**
     * Es un método abstracto, ya que cada especificacion de un Fantasma implementa su propia estrategia para encontrar a Pacman.
     * @param posicion Celda destino
     * @return Retorna la direccion en la cual se movera el fantasma
     */
    @Override
    public Direccion encontrarAPacman(Celda posicion) {
        return null;
    }

}