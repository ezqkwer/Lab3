import java.util.ArrayList;
import java.util.Random;

import Enums.HealthStatus;
import Enums.Mood;
import Parents.Character;
import Parents.Item;

public class Znaika extends Character{
    private final Random random = new Random();

    public Znaika() {
        super("Знайка");
    }


    public void improveMood() {
        
        if (this.mood == Mood.HAPPY){
            System.out.print("Настроение у " + name + " улучшилось до " + mood);
        }
        else{
            System.out.print("Настроение у " + name + " " + mood + ", поэтому он ничего не делал и отправился спать.");
            System.exit(0);
        }
        
    }
 

    public void decideToTidyUp() {
        System.out.print(" и он решил произвести уборку помещения: ");
    }

    public void sweepFloor() {
        System.out.print("он подмел пол в комнате,");
    }

    public void wipeCabinets() {
        System.out.print(" протер стенные шкафы,");
    }

    public void arrangeBooksOnShelves(ArrayList<Book> books, Shelf shelf) {
        System.out.print(name + " разложил книги на " + shelf.getName());
    }

    public void removeBooksFromWindowsill(ArrayList<Book> books, Windowsill windowsill) {
        System.out.println(name + " убирает книги с " + windowsill.getName() + ":");
        for (Book book : books) {
            windowsill.removeItem(book);
        }
    }

    public void decideToRemoveLunarStone(LunarStone stone, Windowsill windowsill) {
        System.out.print(name + " заодно решил убрать и валявшийся там " + stone.getName() + ".");
    }

    public void openCabinet(Cabinet cabinet) {
        System.out.print(" Он открыл " + cabinet.getName());
    }

    public void placeItemOnShelf(Item item, Shelf shelf) throws ShelfFullException {
        shelf.storeItem(item);
    }

    public void bendOver() {
        System.out.print(name + " нагнулся ");
        if (random.nextBoolean()) {
            this.healthStatus = HealthStatus.DIZZY;
            throw new DizzinessException(name + " чувствует " + healthStatus);
        } else {
            System.out.println("и не почувствовал головокружения.");
        }
    }

    public void feelDizziness() {
        System.out.println(name + " снова почувствовал легкое головокружение после наклона.");
    }
}



