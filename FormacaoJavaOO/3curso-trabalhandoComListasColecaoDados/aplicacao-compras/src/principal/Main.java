package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import models.Carrinho;
import models.Cartao;
import models.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        // Pedindo limite do cartão
        System.out.println("Digite o limite do cartão: ");
        Cartao cartao = new Cartao(numero.nextDouble());

        Carrinho carrinho = new Carrinho();

        while (true) {

            // Pedindo dados da compra
            System.out.println("Digite a descrição da compra: ");
            Produto produto = new Produto(texto.nextLine());
            System.out.println("Digite o valor da compra: ");
            produto.setPreco(numero.nextDouble());
            
            if (produto.getPreco() + carrinho.getTotal() <= cartao.getSaldo()) {
                carrinho.getListaCarrinho().add(produto);
                carrinho.adiciona(produto.getPreco());
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }

            System.out.println("Digite 0 para sair ou 1 para continuar:");
            if (numero.nextInt() == 0) {
                break;
            }
        }
        System.out.println("*********************************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(carrinho.getListaCarrinho());
        for (Produto produto : carrinho.getListaCarrinho()) {
            System.out.println(produto);
        }
        System.out.println("*********************************");
    }
}
