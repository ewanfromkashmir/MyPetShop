public class Bird extends Pet implements Walk, Fly
{
    private String species;
    private float wingspan;

    public Bird(String name, int age, String species, float wingspan)
    {
        super(name, age);
        this.species = species;
        this.wingspan = wingspan;
    }

    public String getSpecies()
    {
        return species;
    }

    @Override
    public void makesSound()
    {
        System.out.println("Tweet!");
    }

    @Override
    public void eats()
    {
        System.out.println("Peck peck peck!");
    }


}
