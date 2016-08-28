/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenkwiaciarnia.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author XXX
 */
public class CustomerJUnitTest {
    
    @Test
    public void test1() {
        boolean test = false;
        try {
            Customer c = new Individual(3);
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            
        } catch (Exception ex) {
            test = true;
        }
        assertTrue(test);
    }
    
    @Test
    public void test2(){
        boolean test = false;
        try {
            Customer c = new Company(3,3);
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
            c.add(new Daisy(NameColourClass.Colour.BLUE,true));
        } catch (Exception ex) {
            test = true;
        }
        assertTrue(test);
    }
    
    @Test
    public void test3(){
        Customer c = new Individual(5);
        try {
            Flower f1 = new Daisy(NameColourClass.Colour.BLUE,true);
            c.add(f1);
            Flower f2 = new Tulip(NameColourClass.Colour.BLUE);
            c.add(f2);
            Flower f3 = new Narcissus(NameColourClass.Colour.BLUE,5);
            c.add(f3);
            Flower f4 = new Lily(NameColourClass.Colour.BLUE,4);
            c.add(f4);
            
            assertEquals(true, c.remove(f1));
            assertEquals(false, c.remove(f1));
            assertEquals(f2, c.removeByDescription(f2.getDescription()));
            assertEquals(f3, c.removeByDescription(f3.getDescription()));
            assertEquals(f4, c.removeByDescription(f4.getDescription()));
            assertEquals(null, c.removeByDescription(f1.getDescription()));
            
        } catch (Exception ex) {
            fail();
        }
    }
}
