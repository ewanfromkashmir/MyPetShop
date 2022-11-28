// Dog class inheriting from Pet class
public class Dog extends Pet
{
    // Declaring String breed
    private String breed;

    // Constructor function for Dog class
    public Dog(String name, int age, String breed)
    {
        // Inheriting name and age constructor from Pet class using super method
        super(name, age);

        // Initialising breed variable
        this.breed = breed;
    }

    // Getter function for String breed
    public String getBreed()
    {
        return breed;
    }

    // Declaring method digs to output a message when called
    public void digs()
    {
        System.out.println(this.getName() + " digs a hole!");
    }

    @Override
    public void makesSound()
    {
        System.out.println("Woof!");
    }

    @Override
    public void eats()
    {
        System.out.println("Nom nom nom!");
    }


}
