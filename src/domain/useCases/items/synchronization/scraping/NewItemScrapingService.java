package src.domain.useCases.items.synchronization.scraping;

import src.domain.data.repositories.items.ScrapedItemsRepository;
import src.domain.data.repositories.merchants.MerchantsFilter;
import src.domain.data.repositories.merchants.MerchantsRepository;
import src.domain.entities.Locator;
import src.domain.entities.items.ScrapedItem;
import src.domain.entities.items.exceptions.UnregisteredLocatorDomainException;
import src.domain.entities.merchants.Merchant;
import src.domain.useCases.items.synchronization.ItemScraper;

import java.util.List;

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

    public void ensureAllowedLocator(String aLocator) throws UnregisteredLocatorDomainException {
        Locator locator = new Locator(aLocator);
        MerchantsFilter merchantsFilter = new MerchantsFilter();
        merchantsFilter.siteUrl = locator.domain;
        List<Merchant> merchantList = merchantsRepository.filter(merchantsFilter, null);

        if (merchantList.isEmpty()) {
            throw new UnregisteredLocatorDomainException();
        }
    }
}
