package fantasmas;

import casillas.Celda;
import core.Posicion;
import java.util.*;
import personajes.Direccion;
import personajes.Personaje;

/**
 * Clase que modela las características y el comportamiento general de un Fantasma
 * @author Carlos Alejandro Hernández Mejía
 */
public abstract class Fantasma extends Personaje {

    /**
     * Atributo que indica el tiempo que el Fantasma permanecerá en el Modo ASUSTADO
     */
    private int tiempoAsustado;

    /**
     * Atributo que indica el tiempo que el Fantasma permanecerá en el Modo DISPERSION
     */
    private int tiempoDispersion;

    /**
     * Celda objetivo a la que se moverá el fanstama
     */
    private Celda celdaObjetivo;

    /**
     * Modo de juego del fantasma
     */
    private ModoJuego modo;

    /**
     * Default constructor
     */
    public Fantasma() {
    }

    /**
     * Constructor
     * @param tAsustado Tiempo que el Fantasma permanecerá en el Modo ASUSTADO
     * @param tDispersion Tiempo que el Fantasma permanecerá en el Modo ASUSTADO
     */
    public Fantasma(int tAsustado, int tDispersion) {
        // TODO implement here
        
    }

    /**
     * Este comportamiento se ejecuta cuando PACMAN come una fruta.
     */
    public void asustar() {
        // TODO implement here
        
    }

    /**
     * Este compartamiento se realiza pasados X segundos desde que PACMAN comió la fruta.
     */
    public void dispersar() {
        // TODO implement here
        
    }

    /**
     * Se ejecuta para que los Fantasmas salgan de su casa.
     */
    public void salirDeCasa() {
        // TODO implement here
       
    }

    /**
     * Se ejecuta para que los Fantasmas vuelvan a su celda inicial
     */
    public void volverACasa() {
        // TODO implement here
        
    }

    /**
     * Método abstracto que se ejecuta para rotar al Fantasma.
     * @param angulo Angulo en el que se rotará al personaje, entre 0 y 90 grados (valor absoluto=.
     */
    protected void rotar(int angulo) {
        // TODO implement here
    }

    /**
     * Este método se ejecuta cuando el Fantasma está en modo "ASUSTADO".
     * @return Retorna la esquina seleccionada de forma aleatoria.
     */
    protected Posicion seleccionarEsquinaAleatoria() {
        // TODO implement here
        return null;
    }

    /**
     * Es un método abstracto, ya que cada especificación de un Fantasma implementa su propia estrategia para encontrar a Pacman.
     * @param posicion Celda destino
     * @return Retorna la dirección en la cual se moverá el fantasma
     */
    public abstract Direccion encontrarAPacman(Celda posicion);

    /**
     * @param destino Celda a la que se desea llegar
     * @return Retorna la direccion en la que se moverá
     */
    public Direccion calcularDireccion(Celda destino) {
        // TODO implement here
        return null;
    }

    /**
     * Calcula el angulo de rotación necesario para que el Fantasma se mueva en la dirección indicada (los fantasmas no pueden retroceder)
     * @param direccion Dirección en la que se moverá el Fantasma
     * @return Angulo de rotación, entre -90 y 90, además, es múltiplo de 90.
     */
    protected int calcularRotacion(Direccion direccion) {
        // TODO implement here
        return 0;
    }

    /**
     * Metodo que se ejecuta para colisionar personajes
     */
    public void colisionar() {}
    
    public int getTiempoAsustado() {
        return this.tiempoAsustado;
    }

    public void setTiempoAsustado(int tiempoAsustado) {
        this.tiempoAsustado = tiempoAsustado;
    }

    public int getTiempoDispersion() {
        return this.tiempoDispersion;
    }

    public void setTiempoDispersion(int tiempoDispersion) {
        this.tiempoDispersion = tiempoDispersion;
    }

    public Celda getCeldaObjetivo() {
        return this.celdaObjetivo;
    }

    public void setCeldaObjetivo(Celda celdaObjetivo) {
        this.celdaObjetivo = celdaObjetivo;
    }

}