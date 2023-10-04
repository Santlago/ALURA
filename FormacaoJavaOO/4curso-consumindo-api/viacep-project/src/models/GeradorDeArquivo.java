package models;

import com.google.gson.GsonBuilder;

public class GeradorDeArquivo {
    
    public void salvaJson(EnderecoViaCep endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
    }
}
