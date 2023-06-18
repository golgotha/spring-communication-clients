package com.valeryk.httpclients.resttemplate;

import com.valeryk.httpclients.Fact;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class RestTemplateCatFactsService {

    private final RestTemplate restTemplate;

    public RestTemplateCatFactsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Fact> getFacts() {
        ResponseEntity<List<Fact>> exchange = restTemplate.exchange(
                "https://cat-fact.herokuapp.com/facts",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {});

        return exchange.getBody();
    }
}
