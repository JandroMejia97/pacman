package pacman;

import casillas.Celda;
import comestibles.Fruta;
import comestibles.Pildora;
import fantasmas.Fantasma;
import java.util.*;
import personajes.Direccion;
import personajes.Pacman;
import personajes.Personaje;

/**
 * Tablero del juego que contiene todos los objetos que se representan sobre el mismo.
 * @author Carlos Alejandro Hernández Mejía
 */
public class Tablero {

    /**
     * Filas del tablero
     */
    private int filas;

    /**
     * Columnas del tablero
     */
    private int columnas;

    /**
     * Cantidad máxima de puntos que Pacman podrá consumir
     */
    private int puntajeMaximo;

    /**
     * Puntos ganas por Pacman
     */
    private int puntosGanados;

    /**
     * Juego
     */
    private Juego juego;

    /**
     * Arreglo de fantasmas
     */
    private Fantasma[] fantasmas = new Fantasma[4];

    /**
     * Pacman
     */
    private Pacman pacman;

    /**
     * Celdas del tablero
     */
    private Celda[][] celdas;

    /**
     * Pildoras disponibles en el juego
     */
    private List<Pildora> pildoras = new ArrayList<Pildora>();

    /**
     * Frutas disponibles en el juego
     */
    private Fruta[] frutas = new Fruta[4];

    /**
     * Default constructor
     */
    public Tablero() {
    }

    /**
     * Constructor con parámetros
     * @param filas Cantidad de filas que tendrá el tablero
     * @param columnas Cantidad de columnas que tendrá el tablero
     */
    public void Tablero(int filas, int columnas) {
        // TODO implement here
    }

    /**
     * Inicia el tablero y todos los objetos que se representan sobre él
     */
    public void iniciar() {
        // TODO implement here
    }

    /**
     * Le indica al juego que Pacman ha ganado la partida
     */
    public void ganar() {
        // TODO implement here
    }

    /**
     * Le indica al juego que Pacman ha perdido la partida
     */
    public void perder() {
        // TODO implement here
    }

    /**
     * Pausa el juego
     */
    public void pausar() {
        // TODO implement here
    }

    /**
     * Detiene el juego
     */
    public void detener() {
        // TODO implement here
    }

    /**
     * Reinicia el tablero y devuelvo los personajes y demas objetos  a su estado y posición inicial.
     */
    public void reiniciar() {
        // TODO implement here
    }

    /**
     * Se ejecuta cuando Pacman se ha comido a todos los fantasmas o ha comido todos los puntos del juego sin haberse comido a los Fantasmas.
     */
    public void matarAPacman() {
        // TODO implement here
    }

    /**
     * Retorna la cantidad de puntos que Pacman no ha consumido
     * @return puntos
     */
    public int puntosRestantes() {
        // TODO implement here
        return 0;
    }

    /**
     * Método que inicializa las celdas libres  con sus comestibles, tuneles y obstaculos
     */
    private void inicializarCeldas() {
        // TODO implement here
    }

    /**
     * Metodo que se ejecuta para obtener la posición de Pacman
     * @return
     */
    private Celda rastrearAPacman() {
        // TODO implement here
        return null;
    }

    /**
     * Método que se encarga de inicializar los personajes
     */
    private void inicializarPersonajes() {
        // TODO implement here
    }

    /**
     * Al ejecutarse ubica a los personajes en su posición inicial
     */
    private void reposicionarPersonajes() {
        // TODO implement here
    }

    /**
     * Retorna la cantidad de Fantasmas restantes.
     * @return
     */
    private int cantFantasmasRestantes() {
        // TODO implement here
        return 0;
    }

    /**
     * Se ejecuta cuando Pacman se encuentra un comestible sobre la misma celda y cambia el estado del comestible pasado como parámetro
     * @param c Comestible que será comido por Pacman
     */
    private void comerComestible(Celda c) {
        // TODO implement here
    }

    /**
     * Aumenta la cantidad de puntos ganados
     * @param puntos Cantidad de puntos a incrementar
     */
    private void incrementarPuntaje(int puntos) {
        // TODO implement here
    }

    /**
     * Al ejecutarse le indica a Pacman que se mueva en la dirección pasada como parámetro
     * @param direccion Dirección en la que se moverá Pacman
     */
    public void moverAPacman(Direccion direccion) {
        // TODO implement here
    }

    /**
     * Se ejecuta cuando Pacman se encuentra con un fantasma en la misma Celda y cambia el estado del Fantasma pasado como parámetro
     * @param fantasma Fantasma que fue comido por Pacman
     */
    private void comerFantasma(Fantasma fantasma) {
        // TODO implement here
    }

    /**
     * Metodo que se ejecuta cuando un Personaje hace uso del tunel, pasado desde la celda actual, hacia una celda destino
     * @param p Personaje a teletransportar
     * @param destino Celda donde aparecerá el personaje
     */
    private void teletransportar(Personaje p, Celda destino) {
        // TODO implement here
    }

    /**
     * Método que determina si Pacman se puede desplazar sobre la celda indicada.
     * @param pacPos Celda sobre la que se ubica Pacman
     * @return Fantasma con el que colisionó Pacman
     */
    private Fantasma predecirColision(Celda pacPos) {
        // TODO implement here
        return null;
    }

    /**
     * Obtiene la celda siguiente dadas la celda actual y la dirección de movimiento.
     * @param celActual Celda actual
     * @param dir Direccion de desplazamiento
     * @return Celda que se encuentra luego de la actual en base a la dirección del desplazamiento
     */
    private Celda getSiguienteCelda(Celda celActual, Direccion dir) {
        // TODO implement here
        return null;
    }

    /**
     * Agrega un fantasma en el arreglo
     * @param fantasma fantasma a agregar
     */
    private void agregarFantasma(Fantasma fantasma) {
        // TODO implement here
    }

    /**
    * Agrega una celda en la matriz
     * @param celda Celda a agregar
     */
    private void agregarCelda(Celda celda) {
        // TODO implement here
    }

    public int getFilas() {
        return this.filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return this.columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getPuntajeMaximo() {
        return this.puntajeMaximo;
    }

    public void setPuntajeMaximo(int puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public int getPuntosGanados() {
        return this.puntosGanados;
    }

    public void setPuntosGanados(int puntosGanados) {
        this.puntosGanados = puntosGanados;
    }

    public Juego getJuego() {
        return this.juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Fantasma[] getFantasmas() {
        return this.fantasmas;
    }

    public void setFantasmas(Fantasma[] fantasmas) {
        this.fantasmas = fantasmas;
    }

    public Pacman getPacman() {
        return this.pacman;
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }

    public Celda[][] getCeldas() {
        return this.celdas;
    }

    public void setCeldas(Celda[][] celdas) {
        this.celdas = celdas;
    }

    public List<Pildora> getPildoras() {
        return this.pildoras;
    }

    public void setPildoras(List<Pildora> pildoras) {
        this.pildoras = pildoras;
    }

    public Fruta[] getFrutas() {
        return this.frutas;
    }

    public void setFrutas(Fruta[] frutas) {
        this.frutas = frutas;
    }

}