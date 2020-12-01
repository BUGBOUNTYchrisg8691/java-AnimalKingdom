package animalKingdom;

public class Main
{
    public static void main(String[] args)
    {
        workingWithData();
    }

    public static void workingWithData()
    {
        // mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal dillo = new Mammal("Armadillo", 1758);
        Mammal coon = new Mammal("Raccoon", 1758);
        Mammal squatch = new Mammal("Bigfoot", 2021);

        Bird pidgy = new Bird("Pigeon", 1837);
        Bird pcock = new Bird("Peacock", 1821);
        Bird toucy = new Bird("Toucan", 1758);
        Bird parro = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmo = new Fish("Salmon", 1758);
        Fish catty = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        System.out.println(sloth);
        System.out.println(pidgy);
        System.out.println(perch);
    }
}
