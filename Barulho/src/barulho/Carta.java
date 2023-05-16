/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barulho;

/**
 *
 * @author aluno
 */
public class Carta {
    private String naipe;
    private int num;
    
    public Carta(int naipe, int num) {
        if ( naipe == 0 ) {
            this.naipe = "Paus";
        }
        if ( naipe == 1 ) {
            this.naipe = "Copas";
        }
        if ( naipe == 2 ) {
            this.naipe = "Espada";
        }
        if ( naipe == 3 ) {
            this.naipe = "Ouro";
        }
        this.num = num;
    }
    
    public void printCarta() {
        System.out.println("Carta num: "+(this.num+1)+" de "+this.naipe+"\n");
    }
}
