/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenkwiaciarnia.*;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author XXX
 */
public class CashDeskJUnitTest {
    
    @Test
    public void test1() {
        try {
            PriceList pL = PriceList.getInstance();
            pL.setPrice("bow", 4.50);
            pL.setPrice("Daisy RED true", 3.40);
            pL.setPrice("net", 3.50);
            pL.setPrice("Tulip BLACK", 8.90);
            Customer c = new Individual(5);
            c.add(new Bow(new Daisy(NameColourClass.Colour.RED,true)));
            c.add(new Net(new Bow(new Net(new Tulip(NameColourClass.Colour.BLACK)))));
            
            CashDesk cashDesk = new CashDesk(10);
            double price = cashDesk.serveCustomer(c);
            
            assertEquals(28.3, price, 0.01);
        } catch (Exception ex) {
            fail();
        }
    }
}
