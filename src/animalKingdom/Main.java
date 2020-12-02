package animalKingdom;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Main
{
	public static List<AbstractAnimal> filterAnimals(List<AbstractAnimal> list, CheckAnimal tester)
	{
		List<AbstractAnimal> tmpList = new ArrayList<>();
		for (AbstractAnimal animal : list)
		{
			if (tester.test(animal))
			{
				tmpList.add(animal);
			}
		}

		return tmpList;
	}

	public static void main(String[] args)
	{
		// mammals
		Mammal panda = new Mammal("Panda", 1869, 10);
		Mammal zebra = new Mammal("Zebra", 1778, 10);
		Mammal koala = new Mammal("Koala", 1816, 10);
		Mammal sloth = new Mammal("Sloth", 1804, 10);
		Mammal dillo = new Mammal("Armadillo", 1758, 10);
		Mammal coon = new Mammal("Raccoon", 1758, 10);
		Mammal squatch = new Mammal("Bigfoot", 2021, 10);

		// birds
		Bird pigeon = new Bird("Pigeon", 1837, 10);
		Bird pcock = new Bird("Peacock", 1821, 10);
		Bird toucan = new Bird("Toucan", 1758, 10);
		Bird parrot = new Bird("Parrot", 1824, 10);
		Bird swan = new Bird("Swan", 1758, 10);

		// fish
		Fish salmon = new Fish("Salmon", 1758, 10);
		Fish catfish = new Fish("Catfish", 1817, 10);
		Fish perch = new Fish("Perch", 1758, 10);

		// list of animal instances
		List<AbstractAnimal> animals = new ArrayList<>();
		animals.addAll(Arrays.asList(panda, zebra, koala, sloth, dillo, coon, squatch, pigeon, pcock, toucan, parrot, swan, salmon, catfish, perch));

		// print with lambda expression
		animals.forEach((animal) -> System.out.println(animal));

		System.out.println("\n*** Sort(descending) ***");
		// sort(descending)
		animals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());

		// Collections.sort(animals, Comparator.reverseOrder());


		// print w lambda expression
		animals.forEach((animal) -> System.out.println(animal.getYearDiscovered()));

		System.out.println("\n*** sort(alphabetically) ***");
		// sort(alphabetically)
		animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		// print w for-in loop
		for (AbstractAnimal animal : animals )
		{
			System.out.println(animal);
		}

		System.out.println("\n*** sort by move method ***");
		// sort(by move method)
		animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));

		// easy print
		System.out.println(animals);

		System.out.println("\n*** filter by breath(lungs) ***");
		// filter by `breaths w lungs`
		List<AbstractAnimal> filteredAnimals = filterAnimals(animals, (animal) -> animal.breath() == "Breaths with lungs...");

		// easy print
		System.out.println(filteredAnimals);

		System.out.println("\n*** filter by breath(lungs) and discovered(1758) ***");
		// filter by `breaths w lungs and discovered in 1758`
		filteredAnimals = filterAnimals(animals, (animal) -> animal.breath() == "Breaths with lungs..." && animal.getYearDiscovered() == 1758);

		// print w for loop
		for (int i = 0; i < filteredAnimals.size(); i++)
		{
			System.out.println(filteredAnimals.get(i));
		}

		System.out.println("\n*** filter by reproduce(eggs) and breath(lungs) ***");
		// filter by `lays eggs` and `breaths with lungs`
		filteredAnimals = filterAnimals(animals, (animal) -> animal.breath() == "Breaths with lungs..." && animal.reproduce() == "Lays eggs...");

		// print with while loop
		int i = 0;
		while (i < filteredAnimals.size())
		{
			System.out.println(filteredAnimals.get(i));
			i++;
		}

		System.out.println("\n*** filter by discovered(1758) and sorted(alphabetically) ***");
		// filter by `discovered in 1758` and sort(alphabetically)
		filteredAnimals = filterAnimals(animals, (animal) -> animal.getYearDiscovered() == 1758);
		filteredAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		// print w for-in loop
		for (AbstractAnimal animal : filteredAnimals)
		{
			System.out.println(animal);
		}
	}
}