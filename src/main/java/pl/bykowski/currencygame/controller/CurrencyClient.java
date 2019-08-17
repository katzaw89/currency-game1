package pl.bykowski.currencygame.controller;

import javafx.application.Application;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.currencygame.model.CurrencyModel;

@Controller
public class CurrencyClient {


    @EventListener(ApplicationReadyEvent.class)
    public void getCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject(
                "https://api.exchangeratesapi.io/latest?base=PLN",
                CurrencyModel.class);
        System.out.println(forObject);
    }
}
