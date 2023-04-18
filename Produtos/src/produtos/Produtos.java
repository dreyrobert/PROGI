/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produtos;

/**
 *
 * @author aluno
 */

public class Produtos {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Produto robert;
        robert = new Produto(10, 9.99, "robert");
        
        ItemPedido rob = new ItemPedido(robert, 10);
        
        Pedido ped = new Pedido(2);
        ped.adicionarItem(rob, 1);
    }
    
}
