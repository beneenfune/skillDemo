import static org.junit.Assert.*;


import org.junit.*;

public class skillDemoFileTest {

    @Test
    public void subtraction(){
        assertEquals(4, skillDemoFile.subtract(4, skillDemoFile.subtract(7,4)));
    }
    
}
