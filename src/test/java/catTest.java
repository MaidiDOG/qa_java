import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class catTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundCatTest() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

}
