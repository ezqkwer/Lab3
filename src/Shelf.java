import java.util.ArrayList;

import Parents.Item;


public class Shelf implements Furniture {
    private final String name;
    private final String location;
    private final int capacity;             //вместимость
    private final ArrayList<Item> items = new ArrayList<>();   //массив предметов

    public Shelf(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
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
    public void storeItem(Item item) throws ShelfFullException {
        if (items.size() >= capacity) {
            throw new ShelfFullException(name + " переполнена.");        //создание и вызов исключения
        }
        items.add(item);
        item.setLocation(this.location);
        System.out.println("Он положил " + item.getName() + " на " + name );
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Убрал " + item.getName() + " с полки '" + name + "'");
    }
}