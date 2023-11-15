package src.domain.data.repositories.merchants;

import src.domain.entities.merchants.Merchant;

import java.util.List;
import java.util.UUID;

public interface MerchantsRepository {
    public List<Merchant> filter(MerchantsFilter filter, MerchantsPagination pagination);

    public Merchant read(UUID uuid);

    public void save(Merchant merchant);
}
