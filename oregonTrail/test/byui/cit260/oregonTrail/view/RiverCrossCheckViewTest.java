/*
 * Copyright (C) 2017 Cece's
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
package byui.cit260.oregonTrail.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cece's
 */
public class RiverCrossCheckViewTest {
    
    public RiverCrossCheckViewTest() {
    }

    /**
     * Test of displayCheck method, of class RiverCrossCheckView.
     */
    @Test
    public void testDisplayCheck() {
        System.out.println("displayCheck");
        int riverDepth = 0;
        int probability = 0;
        RiverCrossCheckView instance = new RiverCrossCheckView();
        boolean expResult = false;
        boolean result = instance.displayCheck(riverDepth, probability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
