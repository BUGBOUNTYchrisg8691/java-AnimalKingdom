package animalKingdom;

public class Fish extends AbstractAnimal
{
    // constructor
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    // abstract class overrides
    @Override
    public String move()
    {
        return "Swimming...";
    }

    @Override
    public String breath()
    {
        return "Breathing with gills...";
    }

    @Override
    public String reproduce()
    {
        return "Laying eggs...";
    }
}
