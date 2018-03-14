package consumer.wikipedia.types;

import java.util.Map;

import lombok.Data;

@Data
public class Query {
    
    private Map<String,Page> pages;
}