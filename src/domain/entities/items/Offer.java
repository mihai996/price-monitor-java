package src.domain.entities.items;

import java.time.LocalDateTime;

public record Offer(Price price, Price priceWithDiscount, LocalDateTime dateTime) {
}
