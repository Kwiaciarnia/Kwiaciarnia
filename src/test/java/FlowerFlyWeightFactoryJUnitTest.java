
import com.mycompany.mavenkwiaciarnia.*;
import org.junit.Assert;
import org.junit.Test;


public class FlowerFlyWeightFactoryJUnitTest {
    
     @Test(timeout = 10000)
     public void test() {
         Flower f1 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", "Czerwony");
         Flower f2 = FlowerFlyWeightFactory.flyWeightFactory("Tulip", "Czerwony");
         Assert.assertEquals(f1,f2);
         Flower f3 = FlowerFlyWeightFactory.flyWeightFactory("No name", "Black");
         Assert.assertNull(f3);
         Flower f4 = FlowerFlyWeightFactory.flyWeightFactory("Lily", "Czarny",0,0);
         Assert.assertNull(f4);
     }
}
