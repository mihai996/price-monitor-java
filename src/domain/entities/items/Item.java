package src.domain.entities.items;

import java.util.UUID;

public class Item {
    public final UUID uuid;
    private String locator;
    private String name;

    public Item(UUID uuid, String locator, String name) {
        this.uuid = uuid != null ? uuid : UUID.randomUUID();
        this.locator = locator;
        this.name = name;
    }

    public String getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }

    public void renameTo(String aName) {
        name = aName;
    }
}
