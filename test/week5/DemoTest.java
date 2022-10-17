package week5;

import org.junit.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class DemoTest {

    Demo d;
    static FileWriter fw;

    @Before   // before each test case!
    public void setUp() throws Exception {
        d = new Demo();   // Create a new Demo at the begining of each test case...
    }

    @After    // after each test case!
    public void tearDown() throws Exception {
        d = null;   // unlink the reference to the created object...  so the object is deleted.
    }


    @BeforeClass    // at the time of run of this class.
    public static void setUpClass() throws IOException {
        fw = new FileWriter(new File("testOutput.txt"));
    }

    @AfterClass     // at the end of run of this class.
    public static void afterClass() throws IOException {
        fw.close();

    }

    public void writeMessage(String msg){
        try {
            fw.write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void testGetArea() {
        double expected = 200.0;
        double actual = Demo.getArea(20, 10);
        assertEquals(expected, actual, 0.000001);
        writeMessage("GetArea works...");
    }

    @Test
    public void testDummyMethodOne() {
        assertEquals(d.dummyMethod(51), 1);
    }

    @Test
    public void testDummyMethodTwo() {
        assertEquals(d.dummyMethod(33), 2);
    }

    @Test
    public void testDummyMethodFour() {
        assertEquals(d.dummyMethod(12), 4);
    }


    @Test
    public void testDummyMethodWithIllegalArgument() {
        try{
            d.dummyMethod(0);
            fail("No Exception was thrown");
        }
        catch (IllegalArgumentException e){
            writeMessage("Exception works...");
        }
    }

    @Test
    public void checkSuperClass(){
        assertTrue(d instanceof Object);  // superclass / interface...
    }
}