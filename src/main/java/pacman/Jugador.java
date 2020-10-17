package pacman;

import java.util.*;

/**
 * Clase que representa al jugador de la partida
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Jugador {

    /**
     * Alias del jugador
     */
    private String alias;

    /**
     * Puntaje total que ha obtenido el jugador
     */
    private int puntajeTotal;

    /**
     * Listado de partidas del Jugador.
     */
    private List<Partida> partidas = new ArrayList<Partida>();

    /**
     * Default constructor
     */
    public Jugador() {
    }

    /**
     * Constructor con parametros
     * @param alias Indica el nombre del Jugador
     */
    public Jugador(String alias) {
        // TODO implement here
    }

    /**
     * Indica si el jugador tiene una partida en curso.
     * @return
     */
    public boolean tienePartidaEnCurso() {
        // TODO implement here
        return false;
    }

    /**
     * Incrementa el puntaje total del jugador al completar cada partida
     * @param puntos Puntos ganados
     */
    public void incrementarPuntaje(int puntos) {
        // TODO implement here
    }

    /**
     * Metodo que agrega una partida en la lista de partidas.
     * @param partida Partida a agregar a la lista de partidas
     */
    public void agregarPartida(Partida partida) {
        // TODO implement here
    }

    /**
     * Este método se invoca para finalizar la partida
     * @param estado estado de la partida
     * @return Partida que se termino
     */
    public Partida finalizarPartida(Estado estado) {
        // TODO implement here
        return null;
    }

    /**
     * Este método devuelve la partida en curso del jugador actual
     * @return Partida en curso
     */
    private Partida obtenerPartidaEnCurso() {
        // TODO implement here
        return null;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPuntajeTotal() {
        return this.puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public List<Partida> getPartidas() {
        return this.partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

}