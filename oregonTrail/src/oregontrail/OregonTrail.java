/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregonTrail.model.Item;
import byui.cit260.oregonTrail.model.Player;

/**
 *
 * @author BradS
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Player playerOne = new Player();
        
        playerOne.setName("Jason");
        playerOne.setSkill("Hunter");
        playerOne.setStartingCurrency(50000);
        
        String playerOneName = playerOne.getName();
        String playerOneSkill = playerOne.getSkill();
        int playerOneStartingCurrency = playerOne.getStartingCurrency();
        
        System.out.println(playerOne.toString());
        
        String ammoName = Item.Ammo.getName();
        String ammoDescription = Item.Ammo.getDescription();
        int ammoWeight = Item.Ammo.getWeight();
        
        System.out.println(Item.Ammo.toString());
    }
    
}
