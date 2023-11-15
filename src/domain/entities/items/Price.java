package src.domain.entities.items;

public record Price (Integer cents, Price.CURRENCY currency) {
    public enum CURRENCY {MDL, USD, EUR, UAH, RUR};
}
