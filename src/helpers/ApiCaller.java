package helpers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

import org.json.JSONObject;

public class ApiCaller {
    public ApiCaller() {
    }
    public JSONObject getCardFromApi() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://db.ygoprodeck.com/api/v7/randomcard.php"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JSONObject json = new JSONObject(response.body());
        return json;
    }
}