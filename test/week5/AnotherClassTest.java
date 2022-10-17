package week5;

import org.junit.*;

import static org.junit.Assert.*;

public class AnotherClassTest {


    @Test
    public void testClassExists() {
        try {
            Class.forName("AnotherClass");
        }
        catch (ClassNotFoundException e){
            fail("This class does not exist");
        }
    }

    @Test
    public void testConstructor(){
        AnotherClass ac = new AnotherClass(1, 2);
        assertEquals(ac.getVar1(), 1);
        assertEquals(ac.getVar2(), 2);
    }

}
