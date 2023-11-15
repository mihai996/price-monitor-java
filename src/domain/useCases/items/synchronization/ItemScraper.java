package src.domain.useCases.items.synchronization;

import src.domain.entities.items.ScrapedItem;

public interface ItemScraper {
    public ScrapedItem scrape(String locator);
}
