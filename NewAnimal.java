public class NewAnimal
{
  private String common;
  private String genus;
  private String species;
  
  public NewAnimal(String c, String g, String s)
  {
    common = c;
    genus = g;
    species = s;
  }
  
  public String getCommon()
  {
    return common;
  }
  
  public String getGenus()
  {
    return genus;
  }
  
  public String getSpecies()
  {
    return species;
  }
}