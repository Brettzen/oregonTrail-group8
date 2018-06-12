/*
 * Copyright (C) 2017 jgqui
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.CharacterControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgqui
 */
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }

    /**
     * Test of calcHealthDraw method, of class CharacterControl.
     */
    @Test
    public void testCalcHealthDraw() throws CharacterControlException {
        
        //TEST CASE #1
        
        System.out.println("Test #1");
        int currentHealth = 80;
        int stamina = 75;
        int amountOfFood = 50;
        int weather = 1;
        int pace = 1;
        CharacterControl instance = new CharacterControl();
        int expResult = 25;
        int result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        //TEST CASE #2
        
        System.out.println("Test #2");
        currentHealth = 10;
        stamina = 75;
        amountOfFood = 50;
        weather = 1;
        pace = 1;
        expResult = 25;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        //TEST CASE #3
        
        System.out.println("Test #3");
        currentHealth = 80;
        stamina = -1;
        amountOfFood = 50;
        weather = 1;
        pace = 1;
        expResult = -1;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        //TEST CASE #4
        
        System.out.println("Test #4");
        currentHealth = 80;
        stamina = 75;
        amountOfFood = -1;
        weather = 1;
        pace = 1;
        expResult = -1;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        //TEST CASE #5
        
        System.out.println("Test #5");
        currentHealth = 0;
        stamina = 75;
        amountOfFood = 75;
        weather = 1;
        pace = 1;
        expResult = 25;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        //TEST CASE #6
        
        System.out.println("Test #6");
        currentHealth = 75;
        stamina = 0;
        amountOfFood = 70;
        weather = 1;
        pace = 1;
        expResult = 30;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        // TEST CASE #7
        
        System.out.println("Test #7");
        currentHealth = 80;
        stamina = 75;
        amountOfFood = 100;
        weather = 1;
        pace = 1;
        expResult = 15;
        result = instance.calcHealthDraw(currentHealth, stamina, amountOfFood, weather, pace);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");*/
    }
    
}
