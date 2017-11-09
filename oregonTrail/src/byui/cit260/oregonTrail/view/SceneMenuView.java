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
 * @author Brett Starks
 */
class SceneMenuView extends View{

    
    
    public SceneMenuView() {
        super("\n"
                    + "\n-----------------------------------------------------"
                    + "\n| Daily Trail Menu                                  |"
                    + "\n-----------------------------------------------------"
                    + "\n|T - Visit Town (If Town is Present)                |"
                    + "\n|F - Visit Fort (If Fort is Present)                |"
                    + "\n|C - Cross River (If River is Present)              |"
                    + "\n|R - Rest for a Day                                 |"
                    + "\n|H - Go Hunting                                     |"
                    + "\n|G - Gather Edible Plants                           |"
                    + "\n|Q - Go to Game Menu                                |"
                    + "\n-----------------------------------------------------");
    }

    
    @Override
    public boolean doAction(String menuOption) {      
        
        menuOption = menuOption.toUpperCase();
        
        switch(menuOption) {
            case "T":
                this.displayTownMenu();
                break;
            case "F":
                this.displayFortMenu();
                break;
            case "C":
                this.displayRiverCrossMenu();
                break;
            case "R":
                this.restAction();
                break;
            case "H":
                this.displayHuntMenu();
                break;
            case "G":
                this.displayGatherMenu();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }

    private void displayTownMenu() {
        System.out.println("\n*** displayTownMenu() called. ***");
    }

    private void displayFortMenu() {
        System.out.println("\n*** displayFortMenu() called. ***");
    }

    private void displayRiverCrossMenu() {
        RiverCrossMenuView riverCrossMenu = new RiverCrossMenuView();
        riverCrossMenu.display();
    }

    private void restAction() {
        System.out.println("\n*** restAction() called. ***");
    }

    private void displayHuntMenu() {
        System.out.println("\n*** displayHuntMenu() called. ***");
    }

    private void displayGatherMenu() {
        System.out.println("\n*** displayGatherMenu() called. ***");
    }

    
}
