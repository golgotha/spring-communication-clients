package com.valeryk.httpclients.resttemplate;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class RestTemplateCatFactsClient {

    private final RestTemplateCatFactsService restTemplateCatFactsService;

    public RestTemplateCatFactsClient(RestTemplateCatFactsService restTemplateCatFactsService) {
        this.restTemplateCatFactsService = restTemplateCatFactsService;
    }


    @PostConstruct
    public void init() {
        restTemplateCatFactsService.getFacts()
                .forEach(fact -> log.info("[REST Template] Fact about cat: {}", fact.getText()));;
    }
}
