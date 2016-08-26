
import com.mycompany.mavenkwiaciarnia.*;
import org.junit.Assert;
import org.junit.Test;


public class FlowerFlyWeightFactoryJUnitTest {
    
     @Test
     public void test1() {
         Flower f1 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", Flower.Colour.ORANGE);
         Flower f2 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", Flower.Colour.ORANGE);
         Assert.assertEquals(f1,f2);
     }
     
     @Test
     public void test2(){
         Flower f3 = FlowerFlyWeightFactory.flyWeightFactory("No name", Flower.Colour.BLACK);
         Assert.assertNull(f3);
     }
     
     @Test
     public void test3(){
         Flower f4 = FlowerFlyWeightFactory.flyWeightFactory("Lily", Flower.Colour.BLACK,0,0);
         Assert.assertNull(f4);
     }
     
     @Test
     public void test4(){
         Flower f5 = FlowerFlyWeightFactory.flyWeightFactory("Lily", Flower.Colour.BLACK,0);
         Assert.assertEquals("Lily BLACK 0", f5.getDescription());
     }
}
