package models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaCep {
    
    // methods
    public EnderecoViaCep buscaEndereco(String cep) {

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep.replace("-", "") + "/json/");
        
        HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco)
            .build();
            
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), EnderecoViaCep.class);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Não consegui obter o endereço a partir deste cep");
        }

    }
}
