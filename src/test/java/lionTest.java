import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)
public class lionTest {
    private String sex;
    public lionTest(String sex) {
        this.sex = sex;
    }
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[][] getLionTestData(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

}