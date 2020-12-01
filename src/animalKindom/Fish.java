/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package animalKingdom;

public class Fish extends Animal {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public void move() {
        System.out.println("Swim");
    }

    @Override
    public void breath() {
        System.out.println("Gills");
    }

    @Override
    public void reproduce() {
        System.out.println("Eggs");
    }
}
