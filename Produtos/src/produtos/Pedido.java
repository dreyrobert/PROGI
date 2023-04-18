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
    private ItemPedido[] itens;
    private double valorTotal;
    
    public Pedido(int n) {
        this.valorTotal = 0;
        this.itens = new ItemPedido[n];
    }
    public double obterTotal() {
        return this.valorTotal;
    }
        
    public void adicionarItem(ItemPedido it, int i) {
        this.valorTotal += it.getQuantidade()*it.getProd().getValor();
        this.itens[i] = it;
    }
}
