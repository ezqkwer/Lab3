package Parents;
import java.util.Objects;
import java.util.Random;

import Enums.HealthStatus;
import Enums.Mood;


public abstract class Character {
    public String name;
    public Mood mood;
    public HealthStatus healthStatus;
    
    public Character(String name) {
        this.name = name;
        this.healthStatus = HealthStatus.GOOD;

        int pick = new Random().nextInt(Mood.values().length);   //рандом из Mood
        this.mood = Mood.values()[pick];
    }


    public String getName() {
        return name;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    /*
     @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;                                                                  // если ссылки совпадают
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;                                                                 // проверяем на null и класс
        }
        Carpet carpet = (Carpet) obj;                                                     // приводим объект к типу Carpets.Carpet
        return size == carpet.size && colour.equals(carpet.colour); // сравниваем поля
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
