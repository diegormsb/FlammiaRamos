/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flammiaramos;

public class Empresa {
    public String name;
    public int diasEntrega, diasRestantes;
    
    public Empresa(String name, int dias){
        this.name = name;
        this.diasEntrega = dias;
        this.diasRestantes = dias;
    }
}
