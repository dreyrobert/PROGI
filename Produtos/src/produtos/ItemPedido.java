/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author aluno
 */
public class ItemPedido {
    private Produto prod;
    private int quantidade;
        
    public ItemPedido(Produto pd, int quan) {
        this.prod = pd;
        this.quantidade = quan;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(int q) {
        this.quantidade = q;
    }
    
    public void setProd(Produto p) {
        this.prod = p;
    }

    public Produto getProd() {
        return prod;
    }
}
