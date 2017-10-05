/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author J.R. Basham, Jason Quibilan, Brett Starks
 */
public class Game implements Serializable {
    
    // class instance variables
    private Player player;
    public Game(){
        
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
