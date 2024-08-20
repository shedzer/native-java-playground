package org.example.nativejavaplayground.client;

import java.net.http.HttpClient;
import java.time.Duration;
import java.util.concurrent.Executors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient baseRestClient() {

        return RestClient.builder().requestFactory(
            new JdkClientHttpRequestFactory(
                HttpClient.newBuilder().executor(Executors.newVirtualThreadPerTaskExecutor())
                    .connectTimeout(Duration.ofSeconds(1L)).build()))
            .build();
    }

}
