package consumer.wikipedia.types;

import lombok.Data;

@Data
public class Page {

    private int pageId;
    private int ns;
    private String title;
    private String extract;
}