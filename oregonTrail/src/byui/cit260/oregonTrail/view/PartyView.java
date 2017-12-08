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

import byui.cit260.oregonTrail.model.Party;
import java.util.ArrayList;
import oregontrail.OregonTrail;

/**
 *
 * @author Brett Starks
 */
class PartyView extends View {
    
    Party party = OregonTrail.getCurrentGame().getPlayer().getParty();
    ArrayList<byui.cit260.oregonTrail.model.Character> characters = party.getCharactersInParty();
    
    public PartyView() {
        super();
    }
    
    @Override
    public void display() {
        this.displayMessage = "\n\nYou have the following characters in your party: \n";
        for(byui.cit260.oregonTrail.model.Character character : characters) {
            this.displayMessage += character.getName() 
                                + "\t Health: " + character.getCurrentHealth() + " / " + character.getMaxHealth()
                                + "\t Status: " + character.getStatus()
                                + "\n------------------------------------------------------------------\n";
        }
        this.displayMessage += "\n\n\nPress any key to return.";
        
        this.console.println("\n" + this.displayMessage);
        this.getInput();
    }
    
    @Override
    public String getInput() {
        String value = "";
        try {
            //        Scanner keyboard = new Scanner(System.in);
            value = this.keyboard.readLine();
        } catch (Exception e) {
		 ErrorView.display(this.getClass().getName(),
                  "Error reading input: " + e.getMessage());
            return null;
        }
        return value;
    }
    
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
    
}
