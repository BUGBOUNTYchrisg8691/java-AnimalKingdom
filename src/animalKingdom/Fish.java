package animalKingdom;

public class Fish extends AbstractAnimal
{
	// constructors
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	public Fish(String name, int yearDiscovered, int food)
	{
		super(name, yearDiscovered, food);
	}

	// override methods
	@Override
	public String move()
	{
		return "Swims...";
	}

	@Override
	public String breath()
	{
		return "Breaths through gills...";
	}

	@Override
	public String reproduce()
	{
		return "Lays eggs...";
	}
}