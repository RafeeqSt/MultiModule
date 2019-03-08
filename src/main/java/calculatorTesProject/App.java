package calculatorTesProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int userInput1 = 5;
        int userInput2 = 10;

        int answer =calculator.add(userInput1,userInput2);

        System.out.println("The number you are calculating is : " +answer);

        objectA objA = new objectA("Bob");

        System.out.println(objA.hashCode());

        objectB objB = new objectB("Bob");

        System.out.println(objB.hashCode());


    }
}
