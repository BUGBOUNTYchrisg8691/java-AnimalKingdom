package animalKingdom;

public class Mammal extends AbstractAnimal
{
	// constructors
	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	public Mammal(String name, int yearDiscovered, int food)
	{
		super(name, yearDiscovered, food);
	}

	// method overrides
	@Override
	public String move()
	{
		return "Walks...";
	}

	@Override
	public String breath()
	{
		return "Breaths with lungs...";
	}

	@Override
	public String reproduce()
	{
		return "Gives live birth...";
	}
}