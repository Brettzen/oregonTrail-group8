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

import byui.cit260.oregonTrail.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Brett Starks
 */
public class ItemControl {
    
    static ArrayList<Item> addInventoryItems() {
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(Item.Oxen);
        inventory.add(Item.Food);
        inventory.add(Item.Food);
        inventory.add(Item.Food);
        inventory.add(Item.Ammo);
        inventory.add(Item.Wheel);
        inventory.add(Item.WagonLarge);
        inventory.add(Item.Ammo);
        inventory.add(Item.Ammo);
        

        
        inventory = sortInventory(inventory);
        
        return inventory;
    }

    private static ArrayList<Item> sortInventory(ArrayList<Item> inventory) {
        
        if(inventory.size() < 1) {
            // Will be moving this to ItemMenuView after submitting assignment.
            System.out.println("\n\n\t No items are currently being held.");
            return inventory;
        } else if(inventory.size() < 2) {
            return inventory;
        }
        
        for(int i=0; i < inventory.size(); i++) {
            for(int j=i+1; j < inventory.size(); j++) {
                if(inventory.get(i).getName().compareTo(inventory.get(j).getName()) > 0 ) {
                    Item temp = inventory.get(i);
                    inventory.set(i, inventory.get(j));
                    inventory.set(j, temp);
                }
            }
        }
        
        return inventory;
    }
    
    
}
