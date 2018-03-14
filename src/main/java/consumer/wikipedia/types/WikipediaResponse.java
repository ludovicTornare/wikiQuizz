package consumer.wikipedia.types;

import lombok.Data;

@Data
public class WikipediaResponse {
    private Query query;

    private String batchcomplete;
}