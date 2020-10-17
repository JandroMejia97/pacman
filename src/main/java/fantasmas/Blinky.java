package fantasmas;

import casillas.Celda;
import java.util.*;
import personajes.Direccion;

/**
 * Blinky, el “perseguidor”, es una especificación de un Fantasma, que tiene una estrategia específica para atrapar a Pacman
 * @author Carlos Alejandro Hernández Mejía
 */
public class Blinky extends Fantasma {

    /**
     * Default constructor
     */
    public Blinky() {
        super();
    }

    /**
     * En modo persecución tiene como casillero objetivo la posición actual de Pacman
     * @param posPacman Posicion de Pacman
     */
    @Override
    public Direccion encontrarAPacman(Celda posPacman) {
        // TODO implement here
        return null;
        
    }

    @Override
    public void colisionar() {
    }

    @Override
    protected void rotar(int angulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected int calcularRotacion(Direccion direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}