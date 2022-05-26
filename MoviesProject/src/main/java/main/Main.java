package main;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient(); // Used to send request and retrieve data
        URI uri = new URI("https://imdb-api.com/en/API/Top250Movies/k_hr34no3v");

        HttpRequest request = HttpRequest // Make the request
                .newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); // Get the Response from the request
        System.out.println(response.body());
    }
}
