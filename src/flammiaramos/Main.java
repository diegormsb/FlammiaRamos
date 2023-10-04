
package flammiaramos;


import java.util.concurrent.Semaphore;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaphore mainMutex = new Semaphore(1);
        Hilo narrativa = new Hilo("Narrativa: ", mainMutex);
        Hilo niveles = new Hilo("Niveles: ", mainMutex);
        Hilo sprites = new Hilo("Sprites: ", mainMutex);
        Hilo logica = new Hilo("Logica: ", mainMutex);
        Hilo DLC = new Hilo("DLC: ", mainMutex);
        Hilo integrador = new Hilo("Integrador: ", mainMutex);
        Hilo PM = new Hilo("PM: ", mainMutex);
        Hilo director = new Hilo("Director: ", mainMutex);

        narrativa.start();
        niveles.start();
        sprites.start();
        logica.start();
        DLC.start();
        integrador.start();
        PM.start();
        director.start();
    
    }
    
}
