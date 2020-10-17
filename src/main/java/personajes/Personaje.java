package personajes;

import casillas.Celda;
import java.util.*;

/**
 * Clase que contiene las caracteristicas y comportamientos
 * generales de un personaje
 * @author Carlos Alejandro Hernández Mejía
 */
public abstract class Personaje extends Entidad {

    /**
     * Apodo del personaje
     */
    private String apodo;

    /**
     * Velocidad con la que se mueve el personaje
     */
    private int velocidad;

    /**
     * Celda inicial del personaje
     */
    private Celda celdaInicial;

    /**
     * Celda sobre la que se encuentra el personaje
     */
    private Celda celdaActual;

    /**
     * Direccion en la que se mueve el personaje
     */
    private Direccion direccion;

    /**
     * Default constructor
     */
    public Personaje() {
    }

    /**
     * @param apo Apodo del personaje
     * @param c Color del personaje
     */
    public Personaje(String apo, String c) {
        // TODO implement here
    }

    /**
     * Constructor
     * @param apo Apodo del personaje
     * @param c Color del personaje
     * @param vel Velocidad del personaje
     */
    public Personaje(String apo, String c, int vel) {
        // TODO implement here
    }

    /**
     * Constructor que le permite asiganarle una posición al personaje
     * @param apo Apodo del personaje
     * @param c Color del personaje
     * @param pos Celda en la que iniciará el personaje
   
     */
    public Personaje(String apo, String c, Celda pos) {
        // TODO implement here
    }

    /**
     * Pausa los personajes en el tablero
    
     */
    public void pausar() {
        // TODO implement here
        
    }

    /**
     * Lleva al personaje a su posición inicial.
    
     */
    public void reiniciar() {
        // TODO implement here
       
    }

    /**
     * Metodo que se ejecuta para colisionar personajes
     */
    public abstract void colisionar();

    /**
     * Oculta del tablero al personaje
     */
    public void desaparecer() {
        // TODO implement here
    }

    /**
     * Método abstracto que se ejecuta para rotar al personaje.
     * @param angulo Angulo en el que se rotará al personaje.
     */
    protected abstract void rotar(int angulo);

    /**
     * Muestra al personaje en la posición indicada.
     * @param pos 
     */
    public void aparecer(Celda pos) {
        // TODO implement here
    }

    /**
     * Se ejecuta para que el personaje se mueva en la direccion indicada
     * @param direccion direccion en la que se moverá el personaje
     */
    public void mover(Direccion direccion) {
        // TODO implement here
    }

    /**
     * Calcula el angulo de rotación necesario para que el personaje se mueva en la dirección indicada.
     * @param direccion Dirección en la que se moverá el personaje
     * @return Angulo de rotación, es múltiplo de 90.
     */
    protected abstract int calcularRotacion(Direccion direccion);

    public String getApodo() {
        return this.apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Celda getCeldaInicial() {
        return this.celdaInicial;
    }

    public void setCeldaInicial(Celda celdaInicial) {
        this.celdaInicial = celdaInicial;
    }

    public Celda getCeldaActual() {
        return this.celdaActual;
    }

    public void setCeldaActual(Celda celdaActual) {
        this.celdaActual = celdaActual;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}