import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class felineTest {

   @Spy
    Feline feline;

   @Test
    public void gatFamilyFelineTest(){
       Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
       assertEquals("Кошачьи", feline.getFamily());
   }

   @Test
   public void gatKittensFelineTest(){
       feline.getKittens(1);
       Mockito.verify(feline).getKittens(1);
   }
}