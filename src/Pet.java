// Pet class
public class Pet
{
    // Declaring variables name and age
    private String name;
    private int age;

    // Getter function for name variable
    public String getName()
    {
        return name;
    }

    // Setter function for name variable
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter function for age variable
    public int getAge()
    {
        return age;
    }

    // Setter function for age variable
    public void setAge(int age)
    {
        this.age = age;
    }

    // Constructor function for Pet class
    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Alternative constructor function for Pet class declaring only name variable
    public Pet(String name)
    {
        this.name = name;
    }

    // Declaring method getsOlder to increment the age of a Pet
    public int getsOlder()
    {
        this.age = age + 1;
        return age;
    }
}
