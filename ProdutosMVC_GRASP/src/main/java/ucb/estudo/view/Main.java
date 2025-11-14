/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.view;

import ucb.estudo.controller.ProdutoController;

/*
 * Classe Main - ponto de entrada do sistema.
 * GRASP aplicados:
 *   - Controller: Main instancia o Controller e a View, coordenando a execução do sistema.
 *   - Creator: Main cria instâncias de ProdutoController e ProdutoView.
 */
public class Main {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        ProdutoView view = new ProdutoView(controller);
        view.exibirMenu();
    }
}