package src.domain.data.repositories.items;

public class ItemsPagination {
    public final int page;
    public final int perPage;

    public ItemsPagination(int page, int perPage) {
        this.page = page;
        this.perPage = perPage;
    }
}
