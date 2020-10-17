package pacman;

import java.util.*;

/**
 * Clase que representa una partida para un nivel determinado
 * @author Carlos Alejandro Hernández Mejía
 */
public class Partida {

    /**
     * Puntaje alcanzado en la partida
     */
    private int puntaje = 0;

    /**
     * Nivel en el que se jugó esta partida
     */
    private Nivel nivel;

    /**
     * Estado de la partida
     */
     private Estado estado = Estado.EN_CURSO;

    /**
     * Default constructor
     */
    public Partida() {
    }

    /**
     * Constructor con parámetros
     * @param nivel 
     */
    public Partida(Nivel nivel) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int finalizarPartida() {
        // TODO implement here
        return 0;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Nivel getNivel() {
        return this.nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}