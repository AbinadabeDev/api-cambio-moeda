import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite ou cole sua chave key: ");
        var key = leitura.nextLine();

       URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/latest/USD");
        leitura.close();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //return new Gson().fromJson(response.body(), Moeda.class);

            System.out.println(response.body());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir da key: " + key);
        }

    }
}
