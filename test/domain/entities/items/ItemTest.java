package test.domain.entities.items;

import src.domain.entities.items.Item;

public class ItemTest {
    public void test1() {
        Item item = new Item(null, "some.domain.com", "MacBook Pro M1");
        assert item.uuid.toString().isEmpty();
    }
}
