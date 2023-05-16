/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barulho;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class Baralho {
    private Carta[][] baralho;
    private int quantidade;
    
    public Baralho() {
        this.baralho = new Carta[13][4];
        this.quantidade = 52;
    }
    
    public void createBaralho() {
        for (int i = 0; i < 13; i++) {
            for ( int j = 0; j < 4; j++) {
                baralho[i][j] = new Carta(j, i);   
            }
        }
    }
    
    public void printBaralho() {
        for (int i = 0; i < 13; i++) {
            for ( int j = 0; j < 4; j++) {
                baralho[i][j].printCarta();
            }
        }
    }
    
    public static void main(String[] args) {
        Baralho robert = new Baralho();
        robert.createBaralho();
        robert.printBaralho();   
    }
    
}
