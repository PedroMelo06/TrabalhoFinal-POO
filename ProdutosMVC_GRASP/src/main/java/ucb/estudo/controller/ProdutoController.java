/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.controller;

import ucb.estudo.model.Produto;
import java.util.ArrayList;
import java.util.List;

/*
 * Controller do sistema de produtos.
 * GRASP aplicados:
 *   - Controller: centraliza a coordenação das operações do sistema relacionadas a produtos.
 *   - Creator: responsável por criar instâncias de Produto.
 *   - High Cohesion: toda a lógica desta classe está relacionada apenas a produtos.
 */
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(String nome, double preco) {
        Produto novo = new Produto(nome, preco);  // (Creator)
        produtos.add(novo);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
