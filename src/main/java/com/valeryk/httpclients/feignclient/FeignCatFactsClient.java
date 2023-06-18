package com.valeryk.httpclients.feignclient;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class FeignCatFactsClient {

    private final FeignCatFactsService catFactsService;

    public FeignCatFactsClient(FeignCatFactsService catFactsService) {
        this.catFactsService = catFactsService;
    }

    @PostConstruct
    public void init() {
        catFactsService.getFacts()
                .forEach(fact -> log.info("[Feign Client] Fact about cat: {}", fact.getText()));
    }
}
