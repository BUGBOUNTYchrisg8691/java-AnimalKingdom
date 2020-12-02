package animalKingdom;

public class Bird extends AbstractAnimal
{
	// constructors
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	public Bird(String name, int yearDiscovered, int food)
	{
		super(name, yearDiscovered, food);
	}

	// override methods
	@Override
	public String move()
	{
		return "Flies...";
	}

	@Override
	public String breath()
	{
		return "Breaths with lungs...";
	}

	@Override
	public String reproduce()
	{
		return "Lays eggs...";
	}
}