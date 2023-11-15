package src.domain.entities.items;

import java.time.LocalDateTime;
import java.util.UUID;

public class ScrapedItem {
    public final UUID uuid;
    public final String locator;
    public final String data;
    public final LocalDateTime dateTime;

    public ScrapedItem(UUID uuid, String locator, String data, LocalDateTime dateTime) {
        this.uuid = uuid != null ? uuid : UUID.randomUUID();
        this.locator = locator;
        this.data = data;
        this.dateTime = dateTime;
    }
}
