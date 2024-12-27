import java.util.ArrayList;

import Parents.Item;


public class Cabinet implements Furniture {
    private final String name;
    private final String location;

    ArrayList<Shelf> shelves= new ArrayList<>();     //массив полок

    public Cabinet(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addShelf(Shelf shelf) {          //добавление полок в шкаф
        shelves.add(shelf);
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
    public void storeItem(Item item) {}         //нет реализации для данного класса

    @Override
    public void removeItem(Item item) {}

    
}