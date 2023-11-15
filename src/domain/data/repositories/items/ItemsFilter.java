package src.domain.data.repositories.items;

import src.domain.entities.items.Price;
import src.domain.entities.merchants.Merchant;

public class ItemsFilter {
    public Merchant merchant;
    public String name;
    public Price priceFrom;
    public Price priceTo;
}
