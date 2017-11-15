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

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Item;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brett Starks
 */
class ItemMenuView extends View{
    
    ArrayList<Item> currentInventory = GameControl.currentInventory;
    
    public ItemMenuView(){
        super("\n");
        System.out.println("\n\nCurrent Inventory:");
        System.out.println("--------------------------------------------------");
        if(currentInventory.size() > 0) {
            for(Item item : currentInventory) {
                System.out.println(item.getName() + ": \t" + item.getWeight() + " lbs.");
                System.out.println("--------------------------------------------------");
            }
        } else {
            System.out.println("\n\t No items are currently being held.");
        }
        
        this.displayMessage = "Press any key to return.";
        
    }
    
   @Override
    public void display() {
        System.out.println("\n" + this.displayMessage);
        this.getInput();
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
    
}
