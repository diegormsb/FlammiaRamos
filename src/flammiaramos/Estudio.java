/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flammiaramos;


public class Estudio {
    public int guiones, niveles, sprites, sistemas, DLCs, videojuegosE, videojuegosDLC;
    public int maxGuiones, maxNiveles, maxSprites, maxSistemas, maxDLC;
    GUI gui;
    public long ingreso;

    public Estudio(int maxGuiones, int maxNiveles, int maxSprites, int maxSistemas, int maxDLC, GUI gui){
        this.guiones = 0;
        this.niveles = 0;
        this.sprites = 0;
        this.sistemas = 0;
        this.DLCs = 0;

        this.maxGuiones = maxGuiones;
        this.maxNiveles = maxNiveles;
        this.maxSprites = maxSprites;
        this.maxSistemas = maxSistemas;
        this.maxDLC = maxDLC;
        
        this.videojuegosE = 0; 
        this.videojuegosDLC = 0;
        this.ingreso = 0;
        
        this.gui = gui; 
    }

    public void addParts(String rol, int qty, String empresa){
        switch(rol){
            
            case "narrativa":

                if (this.guiones < this.maxGuiones){
                    this.guiones += qty;
                    System.out.println(empresa + " guiones: " + this.guiones);
                }
                break;

            case "niveles":

                if (this.niveles < this.maxNiveles){
                    this.niveles += qty;
                    System.out.println(empresa + " niveles: " + this.niveles);
                }
                break;

            case "sprites":

                if (this.sprites < this.maxSprites){
                    this.sprites += qty;
                    System.out.println(empresa + " sprites: " + this.sprites);
                }
                break;

            case "logica":

                if (this.sistemas < this.maxSistemas){
                    this.sistemas += qty;
                    System.out.println(empresa + " sistemas: " + this.sistemas);
                }
                break;

            case "DLC":

                if (this.DLCs < this.maxDLC){
                    this.DLCs += qty;
                    System.out.println(empresa + " DLCs: " + this.DLCs);
                }
                break;
                
            case "integrador":
                switch(empresa){
                    case "Nintendo":
                        if((this.niveles>=1) && (this.guiones>=2) && (this.sprites>=4) && (this.sistemas>=4)){
                            if(this.videojuegosE == (this.videojuegosDLC*5)){
                                this.videojuegosE += qty;
                                deleteParts(empresa, false);
                                System.out.println(empresa + "Videojuegos estándar: " + this.videojuegosE);
                            }else if((this.videojuegosE % 5 == 0)){
                                if(this.DLCs>=3){
                                    this.videojuegosDLC += qty;
                                    deleteParts(empresa, true);
                                    System.out.println("Videojuegos con DLCs: " + this.videojuegosDLC);
                                }
                            }else{
                                this.videojuegosE += qty;
                                deleteParts(empresa, false);
                                System.out.println(empresa + " Videojuegos estándar: " + this.videojuegosE);
                            }
                        }
                        break;
                        
                    case "CapCom":
                        if((this.niveles>=1) && (this.guiones>=2) && (this.sprites>=6) && (this.sistemas>=5)){
                            if(this.videojuegosE == (this.videojuegosDLC*3)){
                                this.videojuegosE += qty;
                                deleteParts(empresa, false);
                                System.out.println(empresa + "Videojuegos estándar: " + this.videojuegosE);
                            }else if((this.videojuegosE % 3 == 0)){
                                if(this.DLCs>=1){
                                    this.videojuegosDLC += qty;
                                    deleteParts(empresa, true);
                                    System.out.println("Videojuegos con DLCs: " + this.videojuegosDLC);
                                }
                            }else{
                                this.videojuegosE += qty;
                                deleteParts(empresa, false);
                                System.out.println(empresa + "Videojuegos estándar: " + this.videojuegosE);
                            }
                        }
                        break;
                }
                break;
        }
        gui.updateValues();
    }
    
    public void deleteParts(String empresa, boolean conDLC){
        switch(empresa){
            case "Nintendo":
                this.guiones -= 2;
                this.niveles--;
                this.sprites -= 4;
                this.sistemas -= 4;
                
                if(conDLC){
                    this.DLCs -= 2;
                }
                break;
                
            case "CapCom":
                this.guiones --;
                this.niveles -=2;
                this.sprites -= 6;
                this.sistemas -= 5;
                
                if(conDLC){
                    this.DLCs--;
                }
                break;
        }
    }
    
        public void distribucion(String empresaNombre){
        
        switch(empresaNombre){
            case "Nintendo":
                this.ingreso += (this.videojuegosDLC*600000) + (this.videojuegosE*550000);
                break;
                
            case "CapCom":
                this.ingreso += (this.videojuegosDLC*750000) + (this.videojuegosE*400000);
                break;
        }
        this.gui.actualizarIngreso(this.ingreso, empresaNombre);
        this.gui.actualizarProfit();
        this.videojuegosDLC = 0;
        this.videojuegosE = 0;
    }
}
