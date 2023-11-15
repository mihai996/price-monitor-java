package src.domain.data.sources;

import src.domain.data.sources.exceptions.SourceNotFoundException;
import src.domain.entities.items.Item;

import java.util.UUID;

/**
 * @deprecated
 */
public interface ItemsSource {
    public Item retrieve(UUID uuid) throws SourceNotFoundException;
}
