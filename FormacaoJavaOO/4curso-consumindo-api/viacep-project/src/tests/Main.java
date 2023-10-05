package tests;

import java.io.IOException;
import java.util.Scanner;

import models.ConsultaCep;
import models.EnderecoViaCep;
import models.GeradorDeArquivo;

public class Main {
    
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var cep = leitura.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            EnderecoViaCep novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
