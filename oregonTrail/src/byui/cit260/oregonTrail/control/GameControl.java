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

import byui.cit260.oregonTrail.model.Party;
import byui.cit260.oregonTrail.model.Player;
import oregontrail.OregonTrail;

/**
 *
 * @author Brett Starks, Jason Quibilan, JR Basham
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if(playersName == null) return null;
        
        Player player = new Player();
        player.setName(playersName);
        
        Party party = new Party();
        
        OregonTrail.setPlayer(player);
        player.setParty(party);
        
        //Setting current and max weight statically until we implement functionality. --Brett
        player.getParty().setCurrentWeight(200);
        player.getParty().setMaxWeight(1000);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() called ***");
    }
    
}
