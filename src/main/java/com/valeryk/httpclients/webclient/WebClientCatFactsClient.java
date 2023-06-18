package com.valeryk.httpclients.webclient;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class WebClientCatFactsClient {

    private final WebClientCatFactsService webClientCatFactsService;

    public WebClientCatFactsClient(WebClientCatFactsService webClientCatFactsService) {
        this.webClientCatFactsService = webClientCatFactsService;
    }

    @PostConstruct
    public void init() {
        webClientCatFactsService.getFacts()
                .doOnNext(fact -> log.info("[WebClient] Fact about cat: {}", fact.getText()))
                .subscribe();
    }

}
