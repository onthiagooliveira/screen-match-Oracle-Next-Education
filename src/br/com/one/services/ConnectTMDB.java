package br.com.one.services;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 * {@code ConnectTMDB} é uma classe utilitária responsável por realizar conexões com a
 * <a href="https://developer.themoviedb.org/reference/intro/getting-started">API do The Movie Database (TMDB)</a>.
 *
 * <p>Essa classe demonstra o uso da API HTTP nativa do Java 11+ ({@link HttpClient})
 * para realizar requisições REST autenticadas com token Bearer. Atualmente, o método principal
 * executa uma requisição simples de autenticação para fins de teste.</p>
 *
 * <p><b>Funcionalidades:</b></p>
 * <ul>
 *     <li>Conexão com o endpoint de autenticação da The Movie Database (TMDB);</li>
 *     <li>Envio de requisições HTTP GET com cabeçalhos personalizados;</li>
 *     <li>Impressão do corpo da resposta no console;</li>
 * </ul>
 *
 * <p><b>Exemplo de uso:</b></p>
 * <pre>{@code
 * public static void main(String[] args) throws IOException, InterruptedException {
 *     ConnectTMDB.connect();
 * }
 * }</pre>
 *
 * <p><b>Notas:</b></p>
 * <ul>
 *     <li>Para chamadas reais, substitua o endpoint e o token de autenticação pelo seu token pessoal da TMDB.</li>
 *     <li>Em aplicações maiores, recomenda-se tratar o token de forma segura (ex.: variáveis de ambiente).</li>
 * </ul>
 *
 */

public class ConnectTMDB {
    // Carrega o arquivo .env
    Dotenv dotenv = Dotenv.load();

    // Lê as variáveis
    String apiUrl = dotenv.get("TMDB_AUTH_URL");
    String token = dotenv.get("AUTH_TOKEN");

    /**
     * Executa uma requisição HTTP GET ao endpoint de autenticação da TMDB.
     *
     * <p>Esse método imprime a resposta JSON retornada pela API diretamente no console.</p>
     *
     * @throws IOException se ocorrer um erro de comunicação com o servidor.
     * @throws InterruptedException se a thread for interrompida durante a execução da requisição.
     */
    public static void connect() throws IOException, InterruptedException {

        // Cria um cliente HTTP (objeto reponsável por enviar requisições)
        HttpClient client = HttpClient.newHttpClient();

        // Define a requisição (URI da API, método e cabeçalhos)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(TMDB_AUTH_URL))
                .header("accept", "application/json")
                .header("Authorization", AUTH_TOKEN)
                .GET()
                .build();

        // Envia a requisição e armazena a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Exibe o corpo da resposta no console
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Resposta da TMDB:");
        System.out.println(response.body());
    }
}

