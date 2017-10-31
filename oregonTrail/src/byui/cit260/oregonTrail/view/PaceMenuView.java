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

import java.util.Scanner;

/**
 *
 * @author Jason Quibialan
 */
public class PaceMenuView {
    
    private String menu;
    
    public PaceMenuView() {
        
         this.menu =  "\n"
                    + "\n-------------------------------------------------"
                    + "\n| Pace Menu                                     |"
                    + "\n-------------------------------------------------"
                    + "\n|S - Slow                                       |"
                    + "\n|A - Average                                    |"
                    + "\n|F - Fast                                       |"
                    + "\n|R - Return to previous menu                    |"
                    + "\n-------------------------------------------------"; 
    }
    
    public void displayPaceMenu() {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("R")) return;
            
            done = this.doAction(menuOption);
        }
        
        while(!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() <1) {
                System.out.println("\nInvalid value: value cannot be blank.");
                continue;
            }
            break;
        }
        
        return value;
    }
    
    private boolean doAction(String menuOption) {      
        
        menuOption = menuOption.toUpperCase();
        
        switch(menuOption) {
            case "S":
                this.slowPace();
                break;
            case "A":
                this.averagePace();
                break;
            case "F":
                this.fastPace();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;          
    }
    
    private void slowPace() {
        
        System.out.println("\n*** slowPace() called. ***");
    }
    
    private void averagePace() {
        
        System.out.println("\n*** averagePace() called. ***");
    }
    
    private void fastPace() {
        
        System.out.println("\n*** fastPace() called. ***");
    }
}