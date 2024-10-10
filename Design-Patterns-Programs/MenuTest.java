//Iterator Pattern for Designing Menu
import java.util.Iterator;

interface Menu {
    Iterator<String> createIterator();
}

class BreakfastMenu implements Menu {
    private String[] menuItems = {"Pancakes", "Waffles", "Omelette"};

    public Iterator<String> createIterator() {
        return new ArrayIterator(menuItems);
    }
}

class LunchMenu implements Menu {
    private String[] menuItems = {"Burger", "Sandwich", "Salad"};

    public Iterator<String> createIterator() {
        return new ArrayIterator(menuItems);
    }
}

class ArrayIterator implements Iterator<String> {
    private String[] items;
    private int position = 0;

    public ArrayIterator(String[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public String next() {
        return items[position++];
    }
}

class Waitress {
    Menu breakfastMenu;
    Menu lunchMenu;

    Waitress(Menu breakfastMenu, Menu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    void printMenu() {
        Iterator<String> breakfastIterator = breakfastMenu.createIterator();
        Iterator<String> lunchIterator = lunchMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
    }

    private void printMenu(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}

public class MenuTest {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();

        Waitress waitress = new Waitress(breakfastMenu, lunchMenu);
        waitress.printMenu();
    }
}
























