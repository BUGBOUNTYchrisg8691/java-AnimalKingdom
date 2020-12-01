package animalKingdom;

abstract class AbstractAnimal {
    protected static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public AbstractAnimal(String name, int yearDiscovered)
    {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String consumeFood()
    {
        return "Eating...";
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();
}
