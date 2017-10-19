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

/**
 *
 * @author Brett Starks
 */
public class MapControl {
    
    public int calculateDailyMiles(int avgCharHealth, int avgOxHealth, int currentWeight, int maxWeight, Pace pace) {
            double miles = 20;
        double currentPace = pace.getValue();
        
        if((avgCharHealth <= 0) || (avgCharHealth > 100) || (avgOxHealth <= 0) || (avgOxHealth > 100) || (currentWeight < 0) || (currentWeight > maxWeight)) {
            return -1;
        } else {
            miles *= currentPace;
//            Separating the equation a bit to make it more readable.
            double healthCheck = ((avgCharHealth + avgOxHealth) / 2 ) * .01;
//            double weightCheck = ((maxWeight - currentWeight) / maxWeight) / 2;
            double weightCheck = maxWeight - currentWeight;
            weightCheck = weightCheck / maxWeight;
            miles *= (healthCheck + weightCheck) / 2;

//              Original equation
//              miles = (miles * currentPace) * (((((avgCharHealth + avgOxHealth) / 2)  * .01) +  ((maxWeight - currentWeight) / maxWeight)) / 2);
            miles = Math.round(miles);
        }
        
        return (int) miles;
    }
    
//    PSEUDO FUNCTION
//    currentPace = 1;  maxWeight = 1000;
//calculateDailyMiles(int avgCharHealth, int avgOxHealth, int currentWeight, int maxWeight) return int miles
//     if (avgCharHealth <= 0) || (avgOxHealth <= 0) || (currentWeight < 0) || (currentWeight > maxWeight): return -1 and exit
//    else 
// 	miles = (20 * currentPace) * (((((avgCharHealth + avgOxHealth) / 2)  * .01) +  ((maxWeight - currentWeight) / maxWeight)) / 2)

}
