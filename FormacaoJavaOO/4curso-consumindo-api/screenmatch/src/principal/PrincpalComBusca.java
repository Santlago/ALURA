package principal;

import java.net.URI;

public class PrincpalComBusca {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://foo.com/"))
            .build();
    }
}
