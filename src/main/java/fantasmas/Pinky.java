package fantasmas;

import casillas.Celda;
import java.util.*;
import personajes.Direccion;

/**
 * Pinky, el “emboscador” es una especificación de un Fantasma, que tiene una estrategia específica para atrapar a Pacman
 * @author Carlos Alejandro Hernández Mejía
 */
public class Pinky extends Fantasma {

    /**
     * Default constructor
     */
    public Pinky() {
        super();
    }

    /**
     * Especificación de Pinky, quien trata de llegar a 4 posiciones delante de Pacman, considerando que entre esa posición y la posición de Pacman, no hay obstáculos. Pinky presume que Pacman tratará de llegar a esa posición.
     * @param destino Celda en la que se encuentra Pacman.
     * @return Retorna la dirección en la cual se moverá el fantasma
     */
    public Direccion encontrarAPacman(Celda destino) {
        // TODO implement here
        return null;
    }

}