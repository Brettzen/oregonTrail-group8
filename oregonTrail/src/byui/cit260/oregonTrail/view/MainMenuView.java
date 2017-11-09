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
import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author Brett Starks, Jason Quibilan, JR Basham
 */
public class MainMenuView extends View {
    
    
    
    public MainMenuView() {
              super("\n"
                    + "\n-------------------------------------------------"
                    + "\n| Main Menu                                     |"
                    + "\n-------------------------------------------------"
                    + "\n|N - New Game                                   |"
                    + "\n|S - Save Game                                  |"
                    + "\n|L - Load Game                                  |"
                    + "\n|H - Help Menu                                  |"
                    + "\n|Q - Quit Game                                  |"
                    + "\n-------------------------------------------------");
    }

    
    @Override
    public boolean doAction(String value) {      
        
        value = value.toUpperCase();
        
        switch(value) {
            case "N":
                this.startGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }

    private void startGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() called. ***");
    }

    private void loadSavedGame() {
        System.out.println("\n*** loadGame() called. ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }
    
}
