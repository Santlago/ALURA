package tests;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.ConsultaCep;
import models.EnderecoViaCep;

public class Main {
    
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var cep = leitura.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            EnderecoViaCep novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
        } catch (RuntimeException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
