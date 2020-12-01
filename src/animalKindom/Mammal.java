/**
 * @author : chrisg
 * @created : 2020-11-30
**/

package animalKingdom;

public class Mammal extends Animal {
    public Animal(String name, int year) {
        super(name, year);
    }
     
    @Override
    public void move() {
         System.out.println("Walk");
    }

    @Override
    public void breath() {
        System.out.println("Lungs");
    }

    @Override
    public void reproduce() {
        System.out.println("Live birth");
    }
}
