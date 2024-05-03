import java.util.*;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(int capacity, Item[] items) {
        // Sort items based on value per weight ratio
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (item.weight <= remainingCapacity) {
                // Take the whole item
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                // Take a fractional part of the item
                totalValue += (double) item.value / item.weight * remainingCapacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int capacity = 50;
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        double maxValue = getMaxValue(capacity, items);
        System.out.println("Maximum value obtainable: " + maxValue);
    }
}

