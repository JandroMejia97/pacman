package fantasmas;

import casillas.Celda;
import core.Posicion;
import java.util.*;
import personajes.Direccion;

/**
 * Clyde, "el que finge ignorancia" es una especificacion de un Fantasma, que tiene una estrategia especifica para atrapar a Pacman
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Clyde extends Fantasma {
    

    /**
     * Default constructor
     */
    public Clyde() {
        super();
    }

    /**
     * Se ejecuta hasta que la tercera parte de los puntos han sido consumidos
     * @param celda objetivo  
     */
    public void salirDeCasa(Posicion celda) {
        // TODO implement here
       
    }   

    /**
     * Es un método abstracto, ya que cada especificacion de un Fantasma implementa su propia estrategia para encontrar a Pacman.
     * @return Retorna la direccion en la cual se movera el fantasma
     */
    public Direccion encontrarAPacman(Celda posPacman) {
        // TODO implement here
        return null;
       
    }

    @Override
    public void colisionar() {
    }

    public void rotar(int angulo) {
    }

    public int calcularRotacion(Direccion direccion) {
        return 0;
    }

}