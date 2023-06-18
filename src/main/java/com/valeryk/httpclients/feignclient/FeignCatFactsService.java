package com.valeryk.httpclients.feignclient;

import com.valeryk.httpclients.Fact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Valery Kantor
 */
@FeignClient(name = "cats-facts", url = "${api.baseurl}")
public interface FeignCatFactsService {

    @GetMapping(value = "/facts")
    List<Fact> getFacts();

}
