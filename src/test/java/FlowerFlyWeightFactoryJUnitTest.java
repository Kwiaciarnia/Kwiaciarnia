
import com.mycompany.mavenkwiaciarnia.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class FlowerFlyWeightFactoryJUnitTest {
    
     @Test
     public void test1() {
         Flower f1 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", NameColourClass.Colour.ORANGE);
         Flower f2 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", NameColourClass.Colour.ORANGE);
         assertEquals(f1,f2);
     }
     
     @Test
     public void test2(){
         Flower f3 = FlowerFlyWeightFactory.flyWeightFactory("No name", NameColourClass.Colour.BLACK);
         assertNull(f3);
     }
     
     @Test
     public void test3(){
         Flower f4 = FlowerFlyWeightFactory.flyWeightFactory("Lily", NameColourClass.Colour.BLACK,0,0);
         assertNull(f4);
     }
     
     @Test
     public void test4(){
         Flower f5 = FlowerFlyWeightFactory.flyWeightFactory("Lily", NameColourClass.Colour.BLACK,0);
         assertEquals("Lily BLACK 0", f5.getDescription());
     }
}
