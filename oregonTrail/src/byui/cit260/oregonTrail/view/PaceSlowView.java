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
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PaceControl;
import java.util.Scanner;

/**
 *
 * @author Jason Quibilan
 */
public class PaceSlowView {
    
   // private String promptMessage;
    
    public PaceSlowView() {
                      
    }
    
    boolean displayPaceSlow() {
        System.out.println("\n Do you want to change your pace to Slow? (y/n)");
        
        Scanner reader = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while(!valid) {
            value = reader.nextLine();
            value = value.trim(); 
            value = value.toUpperCase();
            
            if(value.length() < 1) {
                System.out.println("\n*** Invalid value: value cannot be blank. ***");
                continue;
            } else if(value.equals("N")) {
                System.out.println("\n Either change your pace or get back on trail");
                return false;
            } else if(value.equals("Y")) {
                newPace();
                return true;
            } else {
                System.out.println("\n*** Invalid value: please enter y or n. ***");;
            }
        }
        return false;
    }
    
    // having trouble figuring out how to express my y/n output
    private void newPace() {
        PaceControl value =  new PaceControl();
        boolean PaceControl = true;
       
       if (PaceControl == true) {
           System.out.println("\n Your pace is set to slow");
       } else {
           System.out.println("\n Have a nice day");
           System.exit(0);
       }
        
    }
}
