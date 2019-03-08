package calculatorTesProject;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;
import static org.junit.Assert.*;


public class TestClass {

    @Test
    public void add() {
        int result = calculator.add(2,2);
        Assert.assertEquals(4,result);
    }

    @Ignore
    @Test
    public void subtract() {
        int result = calculator.add(2,2);
        Assert.assertEquals(1234,result);
    }

    @Test
    public void compareValues()
        {
            objectA objA = new objectA("Bob");
            objectB objB = new objectB("Bob");

            Assert.assertEquals(objA.name,objB.name);
        }

    @Test
    public void compareHashValues() //Meant to Fail test
        {
            objectA objA = new objectA("Jack");
            objectB objB = new objectB("Jack");

            Assert.assertEquals(objA.hashCode(),objB.hashCode());
        }
}