package rocks.zipcode.io.itemsorter;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1() { // expected test order is by ascending price
        // given
        Item item3 = new Item(0L, "Grape", 1.0);
        Item item2 = new Item(1L, "Orange", 1.5);
        Item item1 = new Item(2L, "Pear", 3.0);
        Item[] itemsToSort = {item3, item2, item1};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() { // expected test order is by descending price
        // given
        Item item3 = new Item(0L, "Strawberry", 2.0);
        Item item2 = new Item(1L, "Watermelon", 4.5);
        Item item1 = new Item(2L, "Peach", 6.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() { // expected test order is by ascending price / mixed prices test
        // given
        Item item3 = new Item(0L, "Blueberry", 1.75);
        Item item2 = new Item(1L, "Pineapple", 2.25);
        Item item1 = new Item(2L, "Lemon", 1.25);
        Item[] itemsToSort = {item3, item2, item1};
        Item[] expected = {item1, item3, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
