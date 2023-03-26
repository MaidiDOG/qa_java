import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class maneLionTest {
    @Mock
    private Feline feline;
    @Test
    public void doesHaveManeLionGirlTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
    @Test
    public void doesHaveManeLionManTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}