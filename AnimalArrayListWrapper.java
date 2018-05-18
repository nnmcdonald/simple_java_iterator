import java.util.*;

public class AnimalArrayListWrapper extends AbstractCollection<NewAnimal>
{
  private ArrayList<NewAnimal> animalList;
  
  public AnimalArrayListWrapper()
  {
    animalList = new ArrayList<NewAnimal>();
  }
  
  public int size()
  {
    return this.size();
  }
  
  public ArrayList<NewAnimal> getAnimalArrayList()
  {
    return animalList;
  }

  public boolean add(NewAnimal animalIn)
  {
    return animalList.add(animalIn);
  }

  public Iterator<NewAnimal> iterator()
  {
    return new AnimalIterator(this);
  }
}