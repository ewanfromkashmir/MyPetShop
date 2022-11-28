public class Program
{
    public static void main(String[] args)
    {
        // Declaring two instances of Pet, fido and fred, using each of the Pet constructors
        Pet fido = new Pet("Fido", 7);
        Pet fred = new Pet("Fred");

        // Declaring an instance of Dog, wilf
        Dog wilf = new Dog("Wilf", 5, "Collie");

        // Calling wilf's digs method
        wilf.digs();

        // Declaring an instance of Cat, bert
        Cat bert = new Cat("Bert", 10, "Abyssinian");

        // Calling bert's meows method
        bert.meows();
    }
}
