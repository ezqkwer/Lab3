import Parents.Item;


public interface Furniture {
    String getName();

    String getLocation();

    void storeItem(Item item) throws ShelfFullException;    //метод может выбросить исключение ShelfFullException

    void removeItem(Item item);    //(Item item) - любой объект, созданный в классе (наследнике) Item
}
