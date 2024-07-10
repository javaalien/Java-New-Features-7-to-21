package com.alien.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

// What is the HTTP Client API in Java 11, and how do you use it?

public class HttpClientExample {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(10))
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("https://postman-echo.com/get"))
				.GET()
				.build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status Code: " + response.statusCode());
		
		System.out.println("Response Body: " + response.body());

	}
}
