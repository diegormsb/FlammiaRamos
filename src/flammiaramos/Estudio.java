/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flammiaramos;


public class Estudio {
    public int guiones, niveles, spriteSets, sistemas, DLCs;
    public int maxGuiones, maxNiveles, maxSprites, maxSistemas, maxDLC;

    public Estudio(int maxGuiones, int maxNiveles, int maxSprites, int maxSistemas, int maxDLC){
        this.guiones = 0;
        this.niveles = 0;
        this.spriteSets = 0;
        this.sistemas = 0;
        this.DLCs = 0;

        this.maxGuiones = maxGuiones;
        this.maxNiveles = maxNiveles;
        this.maxSprites = maxSprites;
        this.maxSistemas = maxSistemas;
        this.maxDLC = maxDLC;
    }

    public void addParts(String type, int qty){
        switch(type){

            case "guiones":

                if (this.guiones < this.maxGuiones){
                    this.guiones += qty;
//                    System.out.println("guiones: " + this.guiones);
                }
                break;

            case "nivel":

                if (this.niveles < this.maxNiveles){
                    this.niveles += qty;
                }
                break;

            case "spriteSet":

                if (this.spriteSets < this.maxSprites){
                    this.spriteSets += qty;
                }
                break;

            case "sistema":

                if (this.sistemas < this.maxSistemas){
                    this.sistemas += qty;
                }
                break;

            case "DLC":

                if (this.DLCs < this.maxDLC){
                    this.DLCs += qty;
                }
                break;
        }
    }
}
