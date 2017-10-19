/*
 * Copyright (C) 2017 Brett Starks
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

import byui.cit260.oregonTrail.model.Pace;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brett Starks
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calculateDailyMiles method, of class MapControl.
     */
    @Test
    public void testCalculateDailyMiles() {
        System.out.println("calculateDailyMiles");
        
//        TEST CASE #1
        System.out.println("\tTest Case #1");
        
        int avgCharHealth = 80;
        int avgOxHealth = 80;
        int currentWeight = 640;
        int maxWeight = 1000;
        Pace pace = Pace.Average;
        MapControl instance = new MapControl();
        int expResult = 12;
        int result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #2
        System.out.println("\tTest Case #2");
        
        avgCharHealth = -1;
        avgOxHealth = 75;
        currentWeight = 550;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #3
        System.out.println("\tTest Case #3");
        
        avgCharHealth = 1;
        avgOxHealth = -1;
        currentWeight = 1000;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #4
        System.out.println("\tTest Case #4");
        
        avgCharHealth = 100;
        avgOxHealth = 100;
        currentWeight = -1;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
         
//        TEST CASE #5
        System.out.println("\tTest Case #5");
        
        avgCharHealth = 101;
        avgOxHealth = 65;
        currentWeight = 400;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #6
        System.out.println("\tTest Case #6");
        
        avgCharHealth = 45;
        avgOxHealth = 101;
        currentWeight = 600;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #7
        System.out.println("\tTest Case #7");
        
        avgCharHealth = 50;
        avgOxHealth = 40;
        currentWeight = 1001;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = -1;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #8
        System.out.println("\tTest Case #8");
        
        avgCharHealth = 1;
        avgOxHealth = 30;
        currentWeight = 100;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 11;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #9
        System.out.println("\tTest Case #9");
        
        avgCharHealth = 50;
        avgOxHealth = 1;
        currentWeight = 500;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 8;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #10
        System.out.println("\tTest Case #10");
        
        avgCharHealth = 1;
        avgOxHealth = 1;
        currentWeight = 0;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 10;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #11
        System.out.println("\tTest Case #11");
        
        avgCharHealth = 100;
        avgOxHealth = 70;
        currentWeight = 200;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 17;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #12
        System.out.println("\tTest Case #12");
        
        avgCharHealth = 90;
        avgOxHealth = 100;
        currentWeight = 400;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 16;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
        
//        TEST CASE #13
        System.out.println("\tTest Case #13");
        
        avgCharHealth = 100;
        avgOxHealth = 100;
        currentWeight = 1000;
        maxWeight = 1000;
        pace = Pace.Average;
        expResult = 10;
        result = instance.calculateDailyMiles(avgCharHealth, avgOxHealth, currentWeight, maxWeight, pace);
        assertEquals(expResult, result);
                                                                                     
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
