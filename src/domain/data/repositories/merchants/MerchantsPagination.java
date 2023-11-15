package src.domain.data.repositories.merchants;

public class MerchantsPagination {
    public final int page;
    public final int perPage;

    public MerchantsPagination(int page, int perPage) {
        this.page = page;
        this.perPage = perPage;
    }
}
