
package flammiaramos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dev extends Thread {
    private String text;
    private String type;
    private float prodByDay;
    private float counter;
    private int wage;
    private long savings;
    private Semaphore mutex;

    public Dev(String text, Semaphore mutex, String type, float production, int wage){
        this.text = text;
        this.mutex = mutex;
        this.type = type;
        this.counter = 0;
        this.prodByDay = production;
        this.savings = 0;
        this.wage = wage;
    }

    @Override
    public void run(){
        while(true){
            try{

                mutex.acquire();
                savings+=wage;
                counter += this.prodByDay;

                System.out.println(text + counter + " con:  " + savings + "$");
                
                sleep(500);         
                mutex.release();
                sleep(1000);
            }
            catch(InterruptedException ex){
                Logger.getLogger(Dev.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}