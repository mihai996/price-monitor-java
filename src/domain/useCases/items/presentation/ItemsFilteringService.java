package src.domain.useCases.items.presentation;

import src.domain.data.repositories.items.ItemsFilter;
import src.domain.data.repositories.items.ItemsPagination;
import src.domain.data.repositories.items.ItemsRepository;
import src.domain.entities.items.Item;

import java.util.List;

public class ItemsFilteringService {
    private final ItemsRepository itemsRepository;

    public ItemsFilteringService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> filter(ItemsFilter filter, ItemsPagination pagination) {
        return itemsRepository.filter(filter, pagination);
    }
}
