package src.domain.entities.merchants;

import java.util.UUID;

public class Merchant {
    private UUID uuid;
    private String siteUrl;
    private String name;
    private String legalName;

    public Merchant(String legalName, String name, String siteUrl) {
        this.legalName = legalName;
        this.name = name;
        this.siteUrl = siteUrl;
    }

    public Merchant(UUID uuid, String legalName, String name, String siteUrl) {
        this.legalName = legalName;
        this.name = name;
        this.siteUrl = siteUrl;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getName() {
        return name;
    }

    public String getSiteUrl() {
        return siteUrl;
    }
}
