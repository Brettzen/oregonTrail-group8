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
import byui.cit260.oregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Brett Starks, J.R. Basham, Jason Quibilan
 */
public class StartProgramView {
    
    private static String introText = 
                  "\n********************************************************************************************"
                + "\n*                                                                                          *"
                + "\n* This game is a simplified textual version of the classic role playing game, The Oregon   *"
                + "\n* Trail”. Your journey begins in Independence, Missouri. Your goal is to reach Oregon City *"
                + "\n* in the Oregon Territory. While in Independence, Missouri, you choose the members of      *"
                + "\n* your party and pool your available money in order to purchase a wagon, team and          *"
                + "\n* supplies for your journey. Any available money leftover from your purchases can be       *"
                + "\n* taken with you in order to purchase additional supplies at forts along the way.          *"
                + "\n*                                                                                          *"
                + "\n* Along the way on the trail you will stop at forts, landmarks, rivers, and mountains,     *"
                + "\n* facing obstacles based on your select choices and random events. You and your party will *"
                + "\n* be faced with challenges that will test your survival skills on the trail. You are the   *"
                + "\n* your party and you make all of the decisions.                                            *"
                + "\n*                                                                                          *"                
                + "\n* Each member of your party has unique traits of stamina and skill in hunting or           *"                
                + "\n* gathering. These traits are used to calculate the player’s daily health rating, and how  *"                
                + "\n* much they are able to contribute to adding to supplies should you decide to spend a day  *"                
                + "\n* hunting or gathering.                                                                    *"        
                + "\n*                                                                                          *"  
                + "\n* Gameplay pauses at the start of each day. You are given options for your activity each   *"  
                + "\n* day. Standard options include setting a new pace (slow, average, fast), resting for the  *"  
                + "\n* day, hunting, gathering. Some days a fort or a town will be nearby which you can         *"  
                + "\n* choose to visit to purchase more supplies and talk with the people to get information.   *"  
                + "\n* Some days there will be a river to cross, or a mountain to traverse. Depending on your   *"  
                + "\n* pace and the hazards you encounter, your team will cover a certain number of miles each  *"  
                + "\n* day. These miles move your toward your final destination.                                *"  
                + "\n*                                                                                          *"  
                + "\n* The game ends once you arrive at Oregon City.                                            *"  
                + "\n*                                                                                          *"
                + "\n********************************************************************************************";

        
    private String promptMessage;
    
    public static String getIntroText() {
        return introText;
    }

    public static void setIntroText(String introText) {
        StartProgramView.introText = introText;
    }
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(introText);
    }

    public void displayStartProgramView() {  
        boolean done = false;
        do {
            //Will need to eventually move getPlayerName to New Game
            String playersName = this.getPlayersName();
            
            if(playersName.toUpperCase().equals("Q")) return;
            
            done = this.doAction(playersName);
            
        } while(!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("\nInvalid value: value can\'t be blank.");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: The name must be > 1 character");
            return false;
        }
        
        Player player  = GameControl.createPlayer(playersName);

        if(player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println(
                  "\n=================================================="
                + "\n Welcome to the game " + player.getName()
                + "\n Have fun!"
                + "\n=================================================="
        );
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
    
}
