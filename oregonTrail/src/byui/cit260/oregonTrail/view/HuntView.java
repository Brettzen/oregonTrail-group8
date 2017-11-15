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
import byui.cit260.oregonTrail.control.HuntControl;
import java.util.Random;
import java.util.Scanner;
import oregontrail.OregonTrail;
/**
 *
 * @author J.R. Basham
 */
public class HuntView extends View{
    
    private int charHuntingSkill = 3; //Skill not set in Character Model so hard coding it for testing getSkill()
    Random rand = new Random();
    private int wildLifeAmount = rand.nextInt(50) + 1;
    private float charStamina = .5F; //Stamina not set in Character Model so hard coding it for testing getStamina()
    private int amountFood;
    private String animalCheck;
    
      
    public HuntView() {
                   
        super("\n"
                    + "\n-----------------------------------------------------"
                    + "\n| Hunt Menu                                         |"
                    + "\n-----------------------------------------------------"
                    + "\n|H - Hunt                                           |"
                    + "\n|Q - Go Back                                        |"
                    + "\n-----------------------------------------------------");
        
        this.animalCheck =  "\n"
                            + "\n The animal life is currently " + wildLifeAmount + ". Animal life must be greater than 10 to hunt.";
    }
    
    @Override
    public boolean doAction(String menuOption){      
        
        menuOption = menuOption.toUpperCase();
        
        switch(menuOption) {
            case "H":
                this.calcHSuccess();
                break;
            default:
                System.out.println("*** Invalid selection. Try again ***");
                break;
        }
        return false;
    }
    private void calcHSuccess() {
        HuntControl huntControl = new HuntControl();
        amountFood = huntControl.calcHuntSuccess(charHuntingSkill, wildLifeAmount, charStamina);
        if(amountFood <= -1) {
            
            System.out.println("\n There is not enough food to Hunt try again?");
            HuntView huntMenu = new HuntView();
            huntMenu.display();
        } else {
            
            System.out.println("\n You have recovered " + amountFood +" lbs of food." );
            HuntView huntMenu = new HuntView();
            huntMenu.display();
        }
    }   

}