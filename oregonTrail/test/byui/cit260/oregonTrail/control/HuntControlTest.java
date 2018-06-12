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
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.HuntControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J.R. Basham
 */
public class HuntControlTest {
    
    public HuntControlTest() {
    }

    /**
     * Test of calcHuntSuccess method, of class HuntControl.
     * @throws byui.cit260.oregonTrail.exceptions.HuntControlException
     */
    @Test
    public void testCalcHuntSuccess() throws HuntControlException {
        // Test 1
        System.out.println("Test 1");
        int charHuntingSkill = 1;
        int wildLifeAmount = 0;
        float charStamina = .25F;
        HuntControl instance = new HuntControl();
        int expResult = -1;
        int result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 2
        System.out.println("Test 2");
        charHuntingSkill = 2;
        wildLifeAmount = 50;
        charStamina = 0F;
        expResult = -1;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 3
        System.out.println("Test 3");
        charHuntingSkill = 3;
        wildLifeAmount = 11;
        charStamina = 1F;
        expResult = 18;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 4
        System.out.println("Test 4");
        charHuntingSkill = 4;
        wildLifeAmount = 100;
        charStamina = .5F;
        expResult = 63;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 5
        System.out.println("Test 5");
        charHuntingSkill = 5;
        wildLifeAmount = 55;
        charStamina = 1.02F;
        expResult = -1;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 6
        System.out.println("Test 6");
        charHuntingSkill = 6;
        wildLifeAmount = 30;
        charStamina = .70F;
        expResult = 18;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
        
        // Test 7
        System.out.println("Test 7");
        charHuntingSkill = 7;
        wildLifeAmount = 250;
        charStamina = .90F;
        expResult = 161;
        result = instance.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        assertEquals(expResult, result);
    }
    
}
