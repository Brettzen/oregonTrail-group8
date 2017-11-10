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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brett Starks, Jason Quibilan, J.R. Basham
 */
public class RiverSceneControlTest {
    
    public RiverSceneControlTest() {
    }

    /**
     * Test of calculateRiverCrossingProbability method, of class RiverSceneControl.
     */
    @Test
    public void testCalculateRiverCrossingProbability() {
        
        //        TEST CASE #1
        System.out.println("Test #1");
        int riverDepth = 6;
        double currentWeight = 800;
        double maxWeight = 1000;
        RiverSceneControl instance = new RiverSceneControl();
        int expResult = 40;
        int result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #2
        System.out.println("Test #2");
        riverDepth = 2;
        currentWeight = 500;
        maxWeight = 1000;
        expResult = -1;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #3
        System.out.println("Test #3");
        riverDepth = 6;
        currentWeight = -1;
        maxWeight = 1000;
        expResult = -1;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #4
        System.out.println("Test #4");
        riverDepth = 7;
        currentWeight = 1001;
        maxWeight = 1000;
        expResult = -1;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #5
        System.out.println("Test #5");
        riverDepth = 3;
        currentWeight = 400;
        maxWeight = 1000;
        expResult = 100;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #6
        System.out.println("Test #6");
        riverDepth = 6;
        currentWeight = 0;
        maxWeight = 1000;
        expResult = 100;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        //        TEST CASE #7
        System.out.println("Test #7");
        riverDepth = 10;
        currentWeight = 1000;
        maxWeight = 1000;
        expResult = 0;
        result = instance.calculateRiverCrossingProbability(riverDepth, currentWeight, maxWeight);
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
