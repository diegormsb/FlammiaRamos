package flammiaramos;

import java.util.concurrent.Semaphore;

public class Main {
    public static Empresa Nintendo;
    public static Empresa CapCom;
    
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        
        // TODO code application logic here
//        Semaphore mainMutex = new Semaphore(1);
//        Dev narrativa = new Dev("Guiones producidos: ", mainMutex, "narrativa", 0.5f, 240);
//        Dev niveles = new Dev("Niveles producidos: ", mainMutex, "niveles", 0.5f, 312);
//        Dev sprites = new Dev("Sprites sets producidos: ", mainMutex, "sprites", 1f, 480);
//        Dev logica = new Dev("Sistemas de juego producidos: ", mainMutex, "logica", 5f, 192);
//        Dev DLC = new Dev("DLC producidos: ", mainMutex, "DLC", 0.5f, 408);
////        Dev integrador = new Dev("Integrador: ", mainMutex);
////        Dev PM = new Dev("PM: ", mainMutex);
////        Dev director = new Dev("Director: ", mainMutex);
//
//        narrativa.start();
//        niveles.start();
//        sprites.start();
//        logica.start();
//        DLC.start();
////        integrador.start();
////        PM.start();
////        director.start();
    
    }
    
}
