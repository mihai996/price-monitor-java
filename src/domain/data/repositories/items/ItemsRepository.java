package src.domain.data.repositories.items;

import src.domain.entities.items.Item;

import java.util.List;
import java.util.UUID;

public interface ItemsRepository {
    public List<Item> filter(ItemsFilter filter, ItemsPagination pagination);

    public Item read(UUID uuid);

    public void save(Item item);
}
