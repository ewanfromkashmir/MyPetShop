public class Pets
{
    private String name;
    private int age;
    private float weight;
    private String colour;
    private String species;
    private String breed;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getBreed()
    {
        return breed;
    }

    public Pets(String name, int age, float weight, String colour, String species, String breed)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.species = species;
        this.breed = breed;
    }

    public int getsOlder()
    {
        return age++;
    }
}
