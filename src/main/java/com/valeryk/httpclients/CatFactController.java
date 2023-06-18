package com.valeryk.httpclients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Valery Kantor
 */
@RestController
public class CatFactController {

    private CatFactClientFactory catFactClientFactory;

    @GetMapping(value ="/facts?al")
    public List<Fact> getFacts(@RequestParam(value = "impl", required = false) String implementation) {
        return catFactClientFactory.getClient(implementation).getFacts();
    }
}
