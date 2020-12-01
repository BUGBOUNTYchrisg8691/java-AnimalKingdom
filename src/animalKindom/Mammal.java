package animalKingdom;

public class Mammal extends AbstractAnimal
{
    // constructor
    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // abstract class overrides
    @Override
    public String move()
    {
        return "Walking...";
    }

    @Override
    public String breath()
    {
        return "Breathing with lungs...";
    }

    @Override
    public String reproduce()
    {
        return "Giving live birth...";
    }
}
