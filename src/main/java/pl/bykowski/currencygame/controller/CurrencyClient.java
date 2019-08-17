package pl.bykowski.currencygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.currencygame.model.CurrencyModel;

@Controller
public class CurrencyClient {

    public CurrencyModel getCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject(
                "https://api.exchangeratesapi.io/latest?base=PLN",
                CurrencyModel.class);
        return forObject;
    }
}
