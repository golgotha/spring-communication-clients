package com.valeryk.httpclients.webclient;

import com.valeryk.httpclients.Fact;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @author Valery Kantor
 */
@Component
public class WebClientCatFactsService {

    private final WebClient client;

    public WebClientCatFactsService(@Value("${api.baseurl}") String baseUrl) {
        this.client = WebClient.builder().baseUrl(baseUrl).build();
    }

    public Flux<Fact> getFacts() {
        return client.get()
                .uri("/facts")
                .retrieve()
                .bodyToFlux(Fact.class);
    }
}
