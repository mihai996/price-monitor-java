package src.domain.useCases.items.synchronization;

import src.domain.entities.items.Item;

public interface ItemParser {
    public Item parse(String scrapedData);
}
