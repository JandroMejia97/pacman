package personajes;

import java.util.*;

/**
 * Especificacion de un personaje, en este caso, el personaje principal del juego,  quien se mueve por un tablero rectangular de NxM casilleros y va comiendo a su paso pequeñas bolitas que hacen sumar cada una 10 puntos al jugador y también puede comer fruta, que suma 30 puntos al jugador y ésta última accion ademas "asusta" a sus perseguidores (fantasmas), haciéndolos retroceder.
 * @author Carlos Alejandro Hernandez Mejia
 */
public class Pacman extends Personaje {

    /**
     * Puntaje actual
     */
    private int puntaje = 0;

    /**
     * Cantidad de vidas que le restan a Pacman, por defecton 3
     */
    private int vidasRestantes = 3;

    /**
     * Constructor por defecto.
     */
    public Pacman() {
        // TODO implement here
       
    }

    /**
     * Se ejecuta cuando Pacman es atrapado por los Fantasmas o cuando consume todos los puntos, sin haber atrapado a los Fantasmas y se le resta una vida
     * @return Cantidad restante de vidas
     */
    public int restarUnaVida() {
        // TODO implement here
        return 0;
    }

    /**
     * Se ejecuta para rotar a Pacman.
     * @param angulo Angulo en el que se rotara a Pacman, su valor absoluto debe estar entre 0 y 180.
     */
    protected void rotar(int angulo) {
        // TODO implement here
        
    }

    /**
     * Aumenta la cantidad de puntos ganados
     * @param puntos Cantidad de puntos a incrementar
     */
    public void incrementarPuntaje(int puntos) {
        // TODO implement here
        
    }

    /**
     * Calcula el angulo de rotacion necesario para que Pacman se mueva en la direccion indicada.
     * @param direccion Direccion en la que se movera Pacman
     * @return Angulo de rotacion, entre -180 y 180, ademas, es múltiplo de 90.
     */
    protected int calcularRotacion(Direccion direccion) {
        // TODO implement here
        return 0;
    }

    /**
     * Metodo que se ejecuta para colisionar personajes
     */
    public void colisionar() {
    }

    

    

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getVidasRestantes() {
        return this.vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }

}