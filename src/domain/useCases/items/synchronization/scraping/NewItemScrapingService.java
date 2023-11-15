package src.domain.useCases.items.synchronization.scraping;

import src.domain.data.repositories.items.ScrapedItemsRepository;
import src.domain.data.repositories.merchants.MerchantsFilter;
import src.domain.data.repositories.merchants.MerchantsRepository;
import src.domain.entities.items.ScrapedItem;
import src.domain.entities.items.exceptions.UnregisteredLocatorDomainException;
import src.domain.entities.merchants.Merchant;
import src.domain.useCases.items.synchronization.ItemScraper;

import java.util.List;
import java.util.UUID;

public class NewItemScrapingService {
    private final MerchantsRepository merchantsRepository;
    private final ItemScraper itemScraper;
    private final ScrapedItemsRepository scrapedItemsRepository;

    public NewItemScrapingService(
            MerchantsRepository merchantsRepository, ItemScraper itemScraper,
            ScrapedItemsRepository scrapedItemsRepository
    ) {
        this.merchantsRepository = merchantsRepository;
        this.itemScraper = itemScraper;
        this.scrapedItemsRepository = scrapedItemsRepository;
    }

    public String scrape(String locator) throws UnregisteredLocatorDomainException {
        ensureAllowedLocator(locator);
        ScrapedItem scrapedItem = itemScraper.scrape(locator);
        scrapedItemsRepository.save(scrapedItem);

        return scrapedItem.uuid.toString();
    }

    public void ensureAllowedLocator(String locator) throws UnregisteredLocatorDomainException {
        MerchantsFilter merchantsFilter = new MerchantsFilter();
        merchantsFilter.siteUrl = getDomain(locator);
        List<Merchant> merchantList = merchantsRepository.filter(merchantsFilter, null);

        if (merchantList.isEmpty()) {
            throw new UnregisteredLocatorDomainException();
        }
    }

    public String getDomain(String locator) {
        return "https://enter.online/";
    }
}
