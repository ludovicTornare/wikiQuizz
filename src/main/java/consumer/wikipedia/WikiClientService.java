package consumer.wikipedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumer.wikipedia.types.WikipediaResponse;

public class WikiClientService {

    private static final Logger log = LoggerFactory.getLogger(WikiClientService.class);

    public String getTitle(){
     /*   RestTemplate restTemplate = new RestTemplate();
        WikipediaResponse repsonse = restTemplate.getForObject("https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro=&explaintext=&titles=Bee"
        ,WikipediaResponse.class);*/
       return "test";
    }
    

}