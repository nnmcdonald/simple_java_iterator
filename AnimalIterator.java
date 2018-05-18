import java.util.*;

public class AnimalIterator implements Iterator<NewAnimal>
{
  ArrayList<NewAnimal> animalList;
  private int index;
  
  public AnimalIterator(AnimalArrayListWrapper array)
  {
    animalList = array.getAnimalArrayList();
    index = 0;
  }
  
  public NewAnimal next()
  {
    NewAnimal n = animalList.get(index);
    index++;
    return n;
  }
  
  public boolean hasNext()
  {
    try
    {
      animalList.get(index);
      return true;
    }
    catch(IndexOutOfBoundsException e)
    {
      return false;
    }

  }
}