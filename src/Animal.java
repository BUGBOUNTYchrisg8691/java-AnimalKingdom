/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package animalKingdom;

public abstract class Animal {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public Animal(String name, int year) {
        id = idCounter++;
        this.name = name;
        this.yearDiscovered = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int year) {
        this.yearDiscovered = year;
    }

    public void consumeFood(String food) {
        System.out.println("Eating " + food);
    }

    public abstract void move();
    public abstract void breath();
    public abstract void reproduce();
}
