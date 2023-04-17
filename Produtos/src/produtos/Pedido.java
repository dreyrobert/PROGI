/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author aluno
 */
public class Pedido {
    private ItemPedido itens[];
    private double valorTotal;
    
    public Pedido(ItemPedido first) {
        this.valorTotal = 0;
    }
    public double obterTotal() {
        return this.valorTotal;
    }
        
    public void adicionarItem(ItemPedido it) {
        this.valorTotal += it.getQuantidade();
    }
    
    public ItemPedido getItens() {
        return this.itens;
    }
    
}
