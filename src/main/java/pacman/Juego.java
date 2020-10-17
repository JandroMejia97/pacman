package pacman;

import java.util.*;
import personajes.Direccion;

/**
 * Clase que controla la interaccion entre el Usuario y el Tablero del Juego.
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Juego {

    /**
     * Numero del nivel actual que se esta jugando
     */
    private int nivelActual;

    /**
     * Lista de jugadores del juego
     */
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    /**
     * Niveles que posee el juego
     */
    private Nivel[] niveles = new Nivel[255];

    /**
     * Tablero con el que interactua el juego
     */
    private Tablero tablero;

    /**
     * Default constructor
     */
    public Juego() {
    }

    /**
     * Pacman ha ganado la partida
     */
    public void ganar() {
        // TODO implement here
    }

    /**
     * Pacman ha perdido la partida
     */
    public void perder() {
        // TODO implement here
    }

    /**
     * Siempre inicia el juego en el nivel 1 e instancia la partida y el tablero.
     */
    public void iniciar() {
        // TODO implement here
    }

    /**
     * Pausa el juego
     */
    public void pausar() {
        // TODO implement here
    }

    /**
     * Reinicia el tablero
     */
    public void reiniciar() {
        // TODO implement here
    }

    /**
     * Detiene el juego
     */
    public void detener() {
        // TODO implement here
    }

    /**
     * Obtiene Puntaje el puntaje maximo obtenido
     * @return Puntaje obtenido
     */
    public int obtenerMaxPuntaje() {
        // TODO implement here
        return 0;
    }

    /**
     * Obtiene los puntajes de todos los jugadores
     * @return Una lista con los puntajes obtenidos
     */
    public List<Integer> obtenerPuntajes() {
        // TODO implement here
        return null;
    }

    /**
     * Recupera el Jugador actual
     * @return Jugador actual 
     */
    private Jugador obtenerJugadorActual() {
        // TODO implement here
        return null;
    }

    /**
     * Puntaje del jugador actual
     * @return Puntaje del jugador actual 
     */
    public int obtenerPuntajeJugadorActual() {
        // TODO implement here
        return 0;
    }

    /**
     * Busca el jugador indicado por el alias pasado como parametro
     * @param  alias a buscar
     * @return Jugador encontrado
     */
    private Jugador buscarJugador(String alias) {
        // TODO implement here
        return null;
    }

    /**
     * Jugador que ha obtenido el maximo puntaje
     * @return Jugador
     */
    public Jugador obtenerJugadorMaxPuntaje() {
        // TODO implement here
        return null;
    }

    /**
     * Busca un jugador y retorna su puntaje
     * @param alias del jugador
     * @return puntaje del jugador solicitado
     */
    public int obtenerPuntajeJugador(String alias) {
        // TODO implement here
        return 0;
    }

    /**
     * Recupera el nivel solicitado
     * @param numNivel Numero del nivel a obtener
     * @return Nivel obtenido
     */
    private Nivel obtenerNivel(Nivel numNivel) {
        // TODO implement here
        return null;
    }

    public int getNivelActual() {
        return this.nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Nivel[] getNiveles() {
        return this.niveles;
    }

    public void setNiveles(Nivel[] niveles) {
        this.niveles = niveles;
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

}