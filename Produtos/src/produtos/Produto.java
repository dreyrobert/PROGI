/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author aluno
 */
public class Produto {
    private int codigo;
    private double valor;
    private String descr;
        
    public Produto(int cd, double va, String de) {
        this.codigo = cd;
        this.valor = va;
        this.descr = de;
    }
        
   public int getCodigo() {
        return this.codigo;
    }

    public double getValor() {
        return valor;
    }
}
