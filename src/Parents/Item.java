package Parents;

import java.util.Objects;


public abstract class Item {
    protected String name;
    protected String location;

    public Item(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /* 
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;                                           // если ссылки совпадают
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;                                         // проверяем на null и класс
        }

        Item item = (Item) obj;                              // приводим объект к типу Item
        return size == carpet.size && colour.equals(carpet.colour); // сравниваем поля
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return location;
    }
}


