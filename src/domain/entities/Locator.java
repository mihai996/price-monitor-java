package src.domain.entities;

public class Locator {
    public final String locator;
    public final String domain;
    public final String path;

    public Locator(String locator) {
        this.locator = locator;
        this.domain = ""; // todo
        this.path = ""; // todo
    }
}
