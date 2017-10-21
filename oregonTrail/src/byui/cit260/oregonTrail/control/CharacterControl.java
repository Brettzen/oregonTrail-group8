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

/**
 *
 * @author Brett Starks
 */
public class CharacterControl {
    
    public int calcHealthDraw(int currentHealth, int stamina, int amountOfFood, int weather, int pace) {
        
        int dailyHealthDraw = 0;
        int x = 0;
        int y = 0;
        int healthDraw = 0;
        int extraHealthDraw = 0;
        
        if ((currentHealth < 0) || (stamina < 0) || (amountOfFood < 0) || (weather < 0 || weather > 2) || (pace < 0 || pace > 2)) {
            return -1;
        }
        
         x = (currentHealth + stamina + amountOfFood);
         y = (weather + pace);
        
        if ((x <= 300) && (x >= 280)) {
            healthDraw = 5;
        }  else if ((x <= 279) && (x >= 250)) {
            healthDraw = 10;
        }  else if ((x <= 249) && (x >= 210)) {
            healthDraw = 15;
        }  else if ((x <= 209) && (x >= 150)) {
            healthDraw = 20;
        }  else if ((x <= 149) && (x >= 0)) {
            healthDraw = 25;
        }        
        
        if (y == 0) {
            extraHealthDraw = 0;
        }  else if (y == 1) {
            extraHealthDraw = 2;
        }  else if (y == 2) {
            extraHealthDraw = 5;
        }  else if (y == 3) {
            extraHealthDraw = 8;
        }  else if (y == 4) {
            extraHealthDraw = 10;
        }     
        
           dailyHealthDraw = (healthDraw + extraHealthDraw);        
            return dailyHealthDraw;
    }    
}        
            
            
        
    
             
       
        
            