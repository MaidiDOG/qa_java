import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class felineTest {

   @Spy
    Feline feline;

   @Test
    public void gatFamilyFelineTest(){
       Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
       System.out.println(feline.getFamily());
   }

   @Test
   public void gatKittensFelineTest(){
       feline.getKittens(1);
       Mockito.verify(feline).getKittens(1);
   }
}