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

import byui.cit260.oregonTrail.control.CharacterControl;
import byui.cit260.oregonTrail.model.Party;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Character;
import java.util.ArrayList;
import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author J.R. Basham
 */
public class CharacterView extends View {

    ArrayList<Character> characters = CharacterControl.createCharacters();

    public CharacterView() {

    }

    @Override
    public void display() {

        boolean done = false;

        do {
            this.displayMessage = "\n\tChoose the starting character of your party.\n";

            for (Character characters : characters) {
                this.displayMessage += "\n---------------------------------------------------------------"
                        + "\n|"
                        + "\n|" + characters.getMenuSelectionOption() + " - " + "Name: " + characters.getName()
                        + "\n|    Description: " + characters.getDescription()
                        + "\n|    Your Hunting and Gathering Skill: " + characters.getSkill()
                        + "\n|    Starting Salary: $" + characters.getStartingCurrency()
                        + "\n---------------------------------------------------------------";
            }

            String value = this.getInput();
            if(value.toUpperCase().equals("Q")) return;
            done = this.doAction(value);

        } while (!done);
    }
    
    public void displayHotel() {

        boolean done = false;

        do {
            this.displayMessage = "\n\tAdd a character to your party. You can have a maximum of 3 characters.\n";

            for (Character characters : characters) {
                this.displayMessage += "\n---------------------------------------------------------------"
                        + "\n|"
                        + "\n|" + characters.getMenuSelectionOption() + " - " + "Name: " + characters.getName()
                        + "\n|    Description: " + characters.getDescription()
                        + "\n|    Your Hunting and Gathering Skill: " + characters.getSkill()
                        + "\n|    Starting Salary: $" + characters.getStartingCurrency()
                        + "\n---------------------------------------------------------------";
            }

            String value = this.getInput();
            if(value.toUpperCase().equals("Q")) return;
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {
//        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        try {
        while (!valid) {
            this.console.println("\n" + this.displayMessage);

            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
	          "\nInvalid value: value cannot be blank.");
                continue;
            }
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                  "Error reading input: " + e.getMessage());
            return null;
        }
        return value;
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "B":
                this.pickB();
                break;
            case "J":
                this.pickJ();
                break;
            case "C":
                this.pickC();
                break;
            case "E":
                this.pickE();
                break;
            case "M":
                this.pickM();
                break;
            default:
                this.console.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }

    private void pickB() {
        Character bob = characters.get(0);
        OregonTrail.getCurrentGame().getPlayer().getParty().addCharacter(bob);
        characters.remove(0);
        this.console.println("\n\nYou have chosen Bob as your starting character.\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pickJ() {
        Character joe = characters.get(1);
        OregonTrail.getCurrentGame().getPlayer().getParty().addCharacter(joe);
        characters.remove(1);
        this.console.println("\n\nYou have chosen Joe as your starting character.\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pickC() {
        Character cindy = characters.get(2);
        OregonTrail.getCurrentGame().getPlayer().getParty().addCharacter(cindy);
        characters.remove(2);
        this.console.println("\n\nYou have chosen Cindy as your starting character.\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pickE() {
        Character ergon = characters.get(3);
        OregonTrail.getCurrentGame().getPlayer().getParty().addCharacter(ergon);
        characters.remove(3);
        this.console.println("\n\nYou have chosen Ergon IV as your starting character.\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pickM() {
        Character mitch = characters.get(4);
        OregonTrail.getCurrentGame().getPlayer().getParty().addCharacter(mitch);
        characters.remove(4);
        this.console.println("\n\nYou have chosen Mitch as your starting character.\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
