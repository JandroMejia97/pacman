package fantasmas;

import casillas.Celda;
import core.Posicion;
import java.util.*;
import personajes.Direccion;

/**
 * Inky, el “caprichoso“ es una especificación de un Fantasma, que tiene una estrategia específica para atrapar a Pacman
 * @author Carlos Alejandro Hernández Mejía
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
     * @param celda 
     * @param celBlinky 
     */
    public void salirDeCasa(Posicion celda, Celda celBlinky) {
        // TODO implement here
    }

    /**
     * Inky considera una posición 2 casilleros delante de Pacman, y la posición de Blinky, y traza un vector, y duplica su distancia.La celda determinada se Asigna a la celdaObjectivo.
     * @param celPacman Celda en la que se encuentra Pacman
     * @param celBlinky Posición de Blinky
     * @return 
     */
    public Direccion encontrarAPacman(Celda celPacman, Celda celBlinky) {
        // TODO implement here
        return null;
    }

    /**
     * Es un método abstracto, ya que cada especificación de un Fantasma implementa su propia estrategia para encontrar a Pacman.
     * @param posicion Celda destino
     * @return Retorna la dirección en la cual se moverá el fantasma
     */
    @Override
    public Direccion encontrarAPacman(Celda posicion) {
        return null;
    }

}