/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.view;

import ucb.estudo.controller.ProdutoController;
import ucb.estudo.model.Produto;

import java.util.List;
import java.util.Scanner;

/*
 * View do sistema de produtos.
 * GRASP aplicados:
 *   - Low Coupling: View depende apenas do Controller, não acessa diretamente o Model.
 *   - High Cohesion: toda a lógica desta classe é voltada para interação com o usuário.
 */
public class ProdutoView {

    private ProdutoController controller;
    private Scanner input = new Scanner(System.in);

    public ProdutoView(ProdutoController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n======== MENU PRODUTOS ========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(input.nextLine());

            switch (opcao) {
                case 1:
                    opcCadastrar();
                    break;

                case 2:
                    opcListar();
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void opcCadastrar() {
        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Preço: ");
        double preco = Double.parseDouble(input.nextLine());

        controller.cadastrarProduto(nome, preco);
        System.out.println("Produto cadastrado!");
    }

    private void opcListar() {
        List<Produto> produtos = controller.listarProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n--- Produtos Cadastrados ---");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    
    }
}
