/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author aluno
 */
public class Radio {
    private int volume;
    public boolean ligado;
    private int estacao;
    
    public Radio() {
        this.volume = 5;
        this.ligado = true;
        this.estacao = 0;
    }
    
    public Radio(int v) {
        this.volume = 5;
        this.ligado = true;
        this.estacao = v;
    }
    
    public void moreVolume() {
        if ( volume >= 10 ) {
            System.out.println("Volume já está no máximo!");
        }
        else {
            this.volume += 2;
        }
    }
    
    public void lessVolume() {
        if ( volume <= 0 ) {
            System.out.println("Volume já está no mínimo!");
        }
        else {
            this.volume -= 2;
        }
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public int getStation() {
        return this.estacao;
    }
    
    public int setStation(int y) {
        return this.estacao = y;
    }
}
