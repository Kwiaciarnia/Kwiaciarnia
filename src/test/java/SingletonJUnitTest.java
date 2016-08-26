

import com.mycompany.mavenkwiaciarnia.PriceList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Łukasz
 */
public class SingletonJUnitTest {
    
    @Test
    public void test1() {
        PriceList priceList1 = PriceList.getInstance();
        PriceList priceList2 = PriceList.getInstance();
        assertEquals(priceList1,priceList2);
    }
}
