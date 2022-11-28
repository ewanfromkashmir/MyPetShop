// Cat class inheriting from Pet class
public class Cat extends Pet
{
    // Declaring String breed
    private String breed;

    // Constructor function for Cat class
    public Cat(String name, int age, String breed)
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

    // Declaring method meows to output a message when called
    public void meows()
    {
        System.out.print(this.getName() + " meows!");
    }

    // Declaring method sleeps to output a message when called
    public void sleeps()
    {
        System.out.print("zzzzzzz!");
    }
}
