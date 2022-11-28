public class Program
{
    public static void main(String[] args)
    {
        // Declaring an instance of Dog, wilf
        Dog wilf = new Dog("Wilf", 5, "Collie");

        // Calling wilf's digs method
        wilf.digs();

        // Declaring an instance of Cat, bert
        Cat bert = new Cat("Bert", 10, "Abyssinian");

        // Calling bert's meows method
        bert.meows();

        // Calling the makesSound method for wilf and bert
        wilf.makesSound();
        bert.makesSound();

        BorderCollie jane = new BorderCollie("Jane", 8, "Border Collie");
    }
}
