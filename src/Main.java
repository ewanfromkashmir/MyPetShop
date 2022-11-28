public class Main
{
    public static void main(String[] args)
    {
        Pets myPet = new Pets("Fido", 6, 24.8f, "black", "dog", "border collie");
        System.out.println(myPet.getAge());
        myPet.getsOlder();
        System.out.println(myPet.getAge());
    }



}