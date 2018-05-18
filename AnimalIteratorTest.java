import java.util.*;

public class AnimalIteratorTest
{
  public static void main(String[] args)
  {
    AnimalArrayListWrapper array = new AnimalArrayListWrapper();
    array.add(new NewAnimal("Gray Wolf", "Canis", "C.lupus"));
    array.add(new NewAnimal("Bengal Tiger", "Panthera", "P.tigris"));
    array.add(new NewAnimal("King Cobra", "Ophiophagus", "O.hannah"));
    array.add(new NewAnimal("Yellow Canary", "Crithagra Swainson", "C.flaviventris"));
    array.add(new NewAnimal("Polar Bear", "Ursus", "U.maritimus"));

    for(Iterator<NewAnimal> myIterator = array.iterator(); myIterator.hasNext(); )
    {
      NewAnimal a = myIterator.next();
      System.out.println("Name: " + a.getCommon() + "\nSpecies: " + a.getSpecies() + "\nGenus: " + a.getGenus());
    }

  }
}