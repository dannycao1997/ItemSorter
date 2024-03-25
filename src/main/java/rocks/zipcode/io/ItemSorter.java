package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter { // instance field
    private Item[] items;

    public ItemSorter(Item[] items) { //constructor
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) { // comparator to sort array method
        Arrays.sort(this.items, comparator);
        return this.items;
    }
}
