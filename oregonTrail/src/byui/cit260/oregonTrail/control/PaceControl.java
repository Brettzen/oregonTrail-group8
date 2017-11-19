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

import byui.cit260.oregonTrail.model.Pace;
import byui.cit260.oregonTrail.view.PaceMenuView;
import java.util.Random;

/**
 *
 * @author JQ
 */
public class PaceControl {

    //public PaceControl() {
        
    //}
    
    //public static Pace generatePace() {
    //    
    //    Pace currentPace;
    //        int x = 0; // hardcoding for now will update later.
            
        
          
    //    switch (x) {
    //        case 2:
    //            currentPace = Pace.Fast;
    //            break;
    //        case 1:
    //            currentPace = Pace.Average;
    //            break;
    //       default:
    //            currentPace = Pace.Slow;
    //            break;
    //   }
        
    //    return currentPace;
    //}

    /**
     *
     * @return
     */
    
    public static Pace[] createPace() {
        
        Pace[] paces = new Pace[2];
        paces[0] = new Pace("Slow", (int) 0.5);
        paces[1] = new Pace("Average", (int) 1.0);
        paces[2] = new Pace("Fast", (int) 1.5);
        return paces;
    }
    
    
    
}
