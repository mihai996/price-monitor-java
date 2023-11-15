package src.domain.useCases.merchants;

import src.domain.data.repositories.merchants.MerchantsRepository;
import src.domain.entities.merchants.Merchant;

import java.util.UUID;

public class MerchantCreationService {
    private final MerchantsRepository merchantsRepository;

    public MerchantCreationService(MerchantsRepository merchantsRepository) {
        this.merchantsRepository = merchantsRepository;
    }

    public UUID register(String legalName, String name, String siteUrl) {
        Merchant merchant = new Merchant(legalName, name, siteUrl);
        merchantsRepository.save(merchant);

        return merchant.getUuid();
    }
}
