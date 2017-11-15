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
package byui.cit260.oregonTrail.control;

/**
 *
 * @author J.R. Basham
 */
public class GatherControl {
        
    public int calcGathSuccess(int charGatherSkill, int plantLifeAmount, float charStamina) {
        float amountFood;
        if ((charGatherSkill <= 0) || (charGatherSkill > 10)){ 
               return -1;
        } else if (plantLifeAmount < 10) {
               return -2;
        } else if ((charStamina <= 0) || (charStamina > 1)){
               return -3;
        } else {
            float newPlantLifeAmount = plantLifeAmount * charStamina;  
            newPlantLifeAmount = newPlantLifeAmount / charGatherSkill;
            amountFood = newPlantLifeAmount * 2;
            amountFood = Math.round(amountFood);
        }
        return (int) amountFood;
    }
}
