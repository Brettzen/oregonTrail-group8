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

import java.util.Scanner;

/**
 *
 * @author Brett Starks, Jason Quibilan, JR Basham
 */
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView() {
        this.menu =   "\n"
                    + "\n-------------------------------------------------"
                    + "\n| Help Menu                                     |"
                    + "\n-------------------------------------------------"
                    + "\n|G - Game objective                             |"
                    + "\n|H - How to move                                |"
                    + "\n|T - Tips                                       |"
                    + "\n|Q - Return to previous menu                    |"
                    + "\n-------------------------------------------------";
    }

    public void displayMenu() {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q")) return;
            
            done = this.doAction(menuOption);
            
            
        } while(!done);
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
            case "G":
                System.out.println(StartProgramView.getIntroText());
                break;
            case "H":
                System.out.println("Use the options in the Game Menu and Daily Trail Menu to move forward, visit towns, hunt, or gather.");
                break;
            case "T":
                System.out.println("If you want an easier time, choose a banker! If you want a challenge, choose a freeloader!");
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }
    
}
