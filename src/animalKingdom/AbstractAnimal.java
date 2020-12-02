package animalKingdom;

abstract class AbstractAnimal
{
	// fields
	private static int maxId = 1;
	protected int id;
	protected String name;
	protected int yearDiscovered;
	protected int food;

	// constructors
	public AbstractAnimal(String name, int yearDiscovered)
	{
		id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
		food = 1;
	}

	public AbstractAnimal(String name, int yearDiscovered, int food)
	{
		id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
		this.food = food;
	}

	// toString override
	@Override
	public String toString()
	{
		return "\nName: " + name + "\nYear Discovered: " + yearDiscovered + "\nFood: " + food + "\n" + move() + " " + breath() + " " + reproduce();
	}

	// getter and setters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}

	public void setYearDiscovered(int yearDiscovered)
	{
		this.yearDiscovered = yearDiscovered;
	}

	public int getFood()
	{
		return food;
	}

	public void setFood(int food)
	{
		this.food = food;
	}

	// shared methods
	public String consumeFood(int food)
	{
		this.food += food;
		return name + " ate " + food + " food";
	}

	// abstract methods
	abstract String move();
	abstract String breath();
	abstract String reproduce();
}