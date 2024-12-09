import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

Moneda buscarMoneda(String tipoDeMoneda){

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/72ee39a1a40a467d476da851/latest/USD");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();
    HttpResponse<String>  response = null;
    try {
        response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    return new Gson().fromJson(response.body(), Moneda.class);
}
}


