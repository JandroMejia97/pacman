package fantasmas;

import casillas.Celda;
import java.util.*;
import personajes.Direccion;

/**
 * Pinky, el "emboscador" es una especificacion de un Fantasma, que tiene una estrategia especifica para atrapar a Pacman
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Pinky extends Fantasma {

    /**
     * Default constructor
     */
    public Pinky() {
        super();
    }

    /**
     * Especificacion de Pinky, quien trata de llegar a 4 posiciones delante de Pacman, considerando que entre esa posicion y la posicion de Pacman, no hay obstaculos. Pinky presume que Pacman tratara de llegar a esa posicion.
     * @param destino Celda en la que se encuentra Pacman.
     * @return Retorna la direccion en la cual se movera el fantasma
     */
    public Direccion encontrarAPacman(Celda destino) {
        // TODO implement here
        return null;
    }

}