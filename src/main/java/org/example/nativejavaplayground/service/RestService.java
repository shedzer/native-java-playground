package org.example.nativejavaplayground.service;

import lombok.RequiredArgsConstructor;
import org.example.nativejavaplayground.client.RestClientConfig;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestService {

    private final RestClientConfig baseRestClient;

    public String getEndpoint(String endpoint) {
        return baseRestClient.baseRestClient()
            .get()
            .uri(endpoint)
            .retrieve()
            .body(String.class);
    }

    public String postEndpoint(String endpoint, String body) {
        return baseRestClient.baseRestClient()
            .post()
            .uri(endpoint)
            .body(body)
            .retrieve()
            .body(String.class);
    }

}
