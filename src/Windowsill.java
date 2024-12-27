import java.util.ArrayList;

import Parents.Item;


public class Windowsill implements Furniture {
    private final String name;
    private final String location;
    
    private final ArrayList<Item> items = new ArrayList<>();

    public Windowsill(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void storeItem(Item item) {
        items.add(item);
        item.setLocation(this.location);
        System.out.println("Положил " + item.getName() + " на " + name);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Убрал " + item.getName() + " с " + name);
    }
}
