/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.mavenkwiaciarnia.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author XXX
 */
public class ModelJUnitTest {
    
    @Test
    public void test1(){
        try {
            Model model = new Model(5);
            Customer c = new Individual(5);
            model.setCustomer(c);
            
            assertEquals(c, model.getCustomer());
            
            PriceList pL = PriceList.getInstance();
            pL.setPrice("bow", 4.50);
            pL.setPrice("Daisy RED true", 3.40);
            pL.setPrice("net", 3.50);
            pL.setPrice("Tulip BLACK", 8.90);
            c.add(new Bow(new Daisy(NameColourClass.Colour.RED,true)));
            c.add(new Net(new Bow(new Net(new Tulip(NameColourClass.Colour.BLACK)))));
            
            assertEquals(28.3, model.serveCustomer(0), 0.01);
            
            assertEquals(true,model.getCashDesksID().containsAll(Arrays.asList(new Integer[] {0,1,2,3,4})));
            
        } catch (Exception ex) {
            fail();
        }
    }
}
