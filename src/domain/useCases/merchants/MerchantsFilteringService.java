package src.domain.useCases.merchants;

import src.domain.data.repositories.merchants.MerchantsFilter;
import src.domain.data.repositories.merchants.MerchantsPagination;
import src.domain.data.repositories.merchants.MerchantsRepository;
import src.domain.entities.merchants.Merchant;

import java.util.List;

public class MerchantsFilteringService {
    private final MerchantsRepository merchantsRepository;

    public MerchantsFilteringService(MerchantsRepository merchantsRepository) {
        this.merchantsRepository = merchantsRepository;
    }

    public List<Merchant> filter(MerchantsFilter filter, MerchantsPagination pagination) {
        return merchantsRepository.filter(filter, pagination);
    }
}
