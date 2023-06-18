package com.valeryk.httpclients;

import com.valeryk.httpclients.feignclient.FeignCatFactsService;

/**
 * @author Valery Kantor
 */
public class CatFactClientFactory {

    private FeignCatFactsService feignCatFactsService;

    public CatFactClient getClient(String implementation) {
        return null;
    }
}
