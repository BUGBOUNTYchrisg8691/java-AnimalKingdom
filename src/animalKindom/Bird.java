package animalKingdom;

public class Bird extends AbstractAnimal
{
    // constructor
    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // abstract class overrides
    @Override
    public String move()
    {
        return "Flying...";
    }

    @Override
    public String breath()
    {
        return "Breathing with lungs...";
    }

    @Override
    public String reproduce()
    {
        return "Laying eggs...";
    }
}
