package src.domain.data.repositories.items;

import src.domain.entities.items.ScrapedItem;

import java.util.List;
import java.util.UUID;

public interface ScrapedItemsRepository {
    public List<ScrapedItem> read(UUID uuid);

    public void save(ScrapedItem item);
}
