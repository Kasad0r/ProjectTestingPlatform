package MainController;

import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void TestMultiply(){
        Main main = new Main();

       int n =  main.cout(5,5);
        assertEquals(10,n);
    }
}
