import java.util.ArrayList;
import java.util.Random;

import Parents.Location;


public class App {
    public static void main(String[] args) {
        Znaika znaika = new Znaika();
        

        // Локации
        Location tableLocation = new Location("стол");
        Location bedsideTableLocation = new Location("тумбочк");
        Location bed = new Location("кровати");
        Location windowsillLocation = new Location("подоконник");
        Location shelfs = new Location("полки");
        Location corner_of_the_room = new Location("Угол комнаты");
        Location shelfLocation = new Location("Верхняя полка");
        Location lowerShelfLocation = new Location("Нижняя полка");
        Location pot = new Location("химические вещества в баночках");


        // объекты
        Objects chemical_substance = new Objects("", pot.description());
        Objects insect_collections = new Objects("", "коллекции насекомых,");


        // книги
        ArrayList<Book> booksOnTable = new ArrayList<>();
        booksOnTable.add(new Book("Книгу_1", tableLocation.description()));
        booksOnTable.add(new Book("Книгу_2", tableLocation.description()));


        ArrayList<Book> booksOnWindowsill = new ArrayList<>();
        booksOnWindowsill.add(new Book("Книгу_3", windowsillLocation.description()));
        booksOnWindowsill.add(new Book("Книгу_4", windowsillLocation.description()));

        // полки
        Shelf upperShelf = new Shelf("верхняя полка", shelfLocation.description(), 1);
        Shelf lowerShelf = new Shelf("нижняя полка", lowerShelfLocation.description(), 2);
        Shelf shelf_all = new Shelf("полки", shelfs.description(), 2);

        Windowsill windowsill = new Windowsill("подоконника", windowsillLocation.description());

        LunarStone lunarStone = new LunarStone(windowsillLocation.description());

        Cabinet cabinet = new Cabinet("шкаф с минералами ", corner_of_the_room.description());


        znaika.improveMood();
        
        

        znaika.decideToTidyUp();

        znaika.sweepFloor();

        znaika.wipeCabinets();



        System.out.print(" в которых у него хранились " + chemical_substance);
        System.out.print(" и " + insect_collections);



        System.out.print(" а также ");

        znaika.arrangeBooksOnShelves(booksOnTable, shelf_all);

        System.out.print(", которые накопились на " + tableLocation.description() + "е, на " + bedsideTableLocation.description()  + "е, возле " + bed.description() + " и даже на " + windowsillLocation.description() + "е. ");

        
        //заполнение верхней полки
        Random random = new Random();   //генерация числа
        boolean upperShelfFull = random.nextBoolean();
        if (upperShelfFull) {
            try {
                upperShelf.storeItem(new Book("одну из книг", upperShelf.getLocation()));
            } catch (ShelfFullException e) {
                // Игнорируем
            }
        }


        znaika.removeBooksFromWindowsill(booksOnWindowsill, windowsill);
        
        znaika.decideToRemoveLunarStone(lunarStone, windowsill);   

        
        cabinet.addShelf(upperShelf);   //создание верхней и нижней полки в шкафу
        cabinet.addShelf(lowerShelf);


        znaika.openCabinet(cabinet);
        

        try {
            znaika.placeItemOnShelf(lunarStone, upperShelf);
        } catch (ShelfFullException e) {
            System.out.println(e.getMessage());
            System.out.println("На верхних полках не обнаружилось ни одного свободного местечка, кладет на нижнюю полку.");

            try {
                znaika.bendOver();
            } catch (DizzinessException ea) {
                System.out.println(ea.getMessage());
                znaika.feelDizziness();
            }
        }

       
    }  
    
    
}



