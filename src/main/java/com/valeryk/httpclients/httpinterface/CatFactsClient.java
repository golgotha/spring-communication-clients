package com.valeryk.httpclients.httpinterface;

import com.valeryk.httpclients.Fact;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

/**
 * @author Valery Kantor
 */
public interface CatFactsClient {

    @GetExchange(value = "/facts")
    List<Fact> getFacts();
}
