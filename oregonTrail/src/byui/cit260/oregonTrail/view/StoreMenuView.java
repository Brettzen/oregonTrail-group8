/*
 * Copyright (C) 2017 J.R. Basham
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
 * @author J.R. Basham
 */
public class StoreMenuView {
    
    private String menu;
    
    public StoreMenuView() {
            this.menu =   "\n"
                    + "\n-----------------------------------------------------"
                    + "\n| Store Menu                                         |"
                    + "\n-----------------------------------------------------"
                    + "\n|V - View current supplies                          |"
                    + "\n|B - Buy Items                                      |"
                    + "\n|S - Sell Items                                     |"
                    + "\n|Q - Exit the Store                                 |"
                    + "\n-----------------------------------------------------";
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
                System.out.println("\n*** Value cannot be blank ***");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String menuOption) {      
        
        menuOption = menuOption.toUpperCase();
        
        switch(menuOption) {
            case "V":
                this.viewItems();
                break;
            case "B":
                this.buyItems();
                break;
            case "S":
                this.sellItems();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }
        private void viewItems() {
        System.out.println("\n*** viewItems() called.");
    }

    private void buyItems() {
        System.out.println("\n*** buyItems() called.");
    }

    private void sellItems() {
        System.out.println("\n*** sellItems() called.");
    }
}
