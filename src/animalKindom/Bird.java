/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package animalKingdom;

public class Bird extends Animal {
    public Bird(String name, int year) {
        super(name, year);
    }

    @Override
    public void move() {
        System.out.println("Fly");
    }

    @Override
    public void breath() {
        System.out.println("Lungs");
    }

    @Override
    public void reproduce() {
        System.out.println("Eggs");
    }
}
