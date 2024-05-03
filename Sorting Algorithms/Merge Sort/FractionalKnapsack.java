import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(int[] values, int[] weights, int capacity) {
        Item[] items = new Item[values.length];
        for (int i = 0; i < values.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }


        Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (item.weight <= remainingCapacity) {
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                totalValue += (double) item.value / item.weight * remainingCapacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        double maxValue = getMaxValue(values, weights, capacity);
        System.out.println("Maximum value obtainable: " + maxValue);
    }
}

