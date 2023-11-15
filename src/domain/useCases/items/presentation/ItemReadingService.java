package src.domain.useCases.items.presentation;

import src.domain.data.repositories.items.ItemsRepository;
import src.domain.entities.items.Item;

import java.util.UUID;

public class ItemReadingService {
    private final ItemsRepository itemsRepository;

    public ItemReadingService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public Item read(String uuid) {
        return itemsRepository.read(UUID.fromString(uuid));
    }
}
