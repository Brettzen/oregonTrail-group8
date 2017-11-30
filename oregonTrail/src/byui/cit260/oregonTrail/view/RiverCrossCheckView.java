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
package byui.cit260.oregonTrail.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brett Starks
 */
class RiverCrossCheckView {

    
    public RiverCrossCheckView() {
        
    }

    boolean displayCheck(int riverDepth, int probability) {
        System.out.println("\n The river is currently " + riverDepth + " feet. The odds of crossing with your current load are "
                          + probability + "%. Are you SURE you want to cross? (y/n)");
        
        Scanner reader = new Scanner(System.in);
        String value = "";
        boolean valid = false;
//        try {
        while(!valid) {
//            value = this.keyboard.readLine();
            value = reader.nextLine();
            value = value.trim(); 
            value = value.toUpperCase();
            
            if(value.length() < 1) {
                System.out.println("\n*** Invalid value: value cannot be blank. ***");
                continue;
            } else if(value.equals("N")) {
                return false;
            } else if(value.equals("Y")) {
                crossRiver(probability);
                return true;
            } else {
                System.out.println("\n*** Invalid value: please enter y or n. ***");;
            }
        } 
//        } catch (Exception e) {
//	System.out.println("Error reading input: " + e.getMessage());
//        }
        return false;
    }

    private void crossRiver(int probability) {
        Random rand = new Random();
        if(rand.nextInt(100) <= probability) {
            System.out.println("\n*** You have successfully crossed the river. ***");
        } else {
            System.out.println("\n*** The river has proved too much for you! The currents carry you away to a watery grave. ***");
            System.exit(0);
        }
    }
}
