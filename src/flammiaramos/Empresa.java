/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flammiaramos;

import java.util.concurrent.Semaphore;

public class Empresa {
    public String name;
    public int diasEntrega, diasRestantes;
    private int maxDevs, narrativa, niveles, sprites, logica, DLC, integs;
    public Dev[] devs;
    public Estudio estudio;
    private long dia;
    public Semaphore mutex;
    GUI gui;
    
    public Empresa(String name, int duracionDia, int dias, int narrativa, int niveles, int sprites, int logica, int DLC, int integs, GUI gui){
        this.name = name;
        this.diasEntrega = dias;
        this.diasRestantes = dias;
        this.devs = new Dev[12];
        
        this.estudio = new Estudio(25, 20, 55, 35, 10, gui);
        this.mutex = new Semaphore(1);
        
        this.narrativa = narrativa;
        this.niveles = niveles;
        this.sprites = sprites;
        this.logica = logica;
        this.DLC = DLC;
        this.integs = integs;
        
        this.gui = gui;
        
        initDevs();
    }
    
    public void initDevs(){
        switch(this.name){
            case "Nintendo":
                for(int i = 0; i<this.narrativa; i++){
                    Dev dev = new Dev(240, "narrativa", 0.34f, this.dia, this);
                    dev.start();
                    devs[i] = dev;
                }

                for(int i = 0; i<this.niveles; i++){
                    Dev dev = new Dev(312, "niveles", 0.34f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa] = dev;
                }

                for(int i = 0; i<this.sprites; i++){
                    Dev dev = new Dev(480, "sprites", 2f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles] = dev;
                }

                for(int i = 0; i<this.logica; i++){
                    Dev dev = new Dev(192, "logica", 3f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites] = dev;
                }

                for(int i = 0; i<this.DLC; i++){
                    Dev dev = new Dev(408, "DLC", 0.34f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites+this.logica] = dev;
                }

                for(int i = 0; i<this.integs; i++){
                    Dev dev = new Dev(600, "integrador", 0.5f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites+this.logica+this.DLC] = dev;
                }
                break;
                
            case "CapCom":
                for(int i = 0; i<this.narrativa; i++){
                    Dev dev = new Dev(240, "narrativa", 0.25f, this.dia, this);
                    dev.start();
                    devs[i] = dev;
                }

                for(int i = 0; i<this.niveles; i++){
                    Dev dev = new Dev(312, "niveles", 0.25f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa] = dev;
                }

                for(int i = 0; i<this.sprites; i++){
                    Dev dev = new Dev(480, "sprites", 1f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles] = dev;
                }

                for(int i = 0; i<this.logica; i++){
                    Dev dev = new Dev(192, "logica", 5f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites] = dev;
                }

                for(int i = 0; i<this.DLC; i++){
                    Dev dev = new Dev(408, "DLC", 0.5f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites+this.logica] = dev;
                }

                for(int i = 0; i<this.integs; i++){
                    Dev dev = new Dev(600, "integrador", 0.5f, this.dia, this);
                    dev.start();
                    devs[i+this.narrativa+this.niveles+this.sprites+this.logica+this.DLC] = dev;
                }
                break;
        }
        System.out.println("Devs creados "+this.name);
    }
}
