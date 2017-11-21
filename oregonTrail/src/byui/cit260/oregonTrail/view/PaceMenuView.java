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

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.PaceControl;
import byui.cit260.oregonTrail.model.Pace;
import java.util.Scanner;

/**
 *
 * @author Jason Quibialan
 */
public class PaceMenuView extends View {
    
    
    
    public PaceMenuView() {
        
               super("\n"
                    + "\n-------------------------------------------------"
                    + "\n| Pace Menu                                     |"
                    + "\n-------------------------------------------------"
                    + "\n|S - Slow                                       |"
                    + "\n|A - Average                                    |"
                    + "\n|F - Fast                                       |"
                    + "\n|Q - Return to previous menu                    |"
                    + "\n-------------------------------------------------"); 
    }
    
    
    @Override
    public boolean doAction(String menuOption) {      
        
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
    
    //private boolean slowPaceView() {
    private void slowPace() { 
       GameControl.currentPace = PaceControl.setPace(Pace.Slow);
       System.out.println("Pace is now set to " + GameControl.currentPace.getName() + ".");
    }
    
    private void averagePace() {
        GameControl.currentPace = PaceControl.setPace(Pace.Average);
        System.out.println("Pace is now set to " + GameControl.currentPace.getName() + ".");
    }
    
    private void fastPace() {
        GameControl.currentPace = PaceControl.setPace(Pace.Fast);
        System.out.println("Pace is now set to " + GameControl.currentPace.getName() + ".");
    }
}
