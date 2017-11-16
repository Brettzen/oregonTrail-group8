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

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Weather;
import java.util.Scanner;

/**
 *
 * @author Brett Starks
 */
public class WeatherView extends View {
    
    Weather currentWeather = GameControl.currentWeather;
    
    public WeatherView(){
        super(); 
    }
    
   @Override
    public void display() {
        this.displayMessage = "The weather looks like: " + currentWeather.getName()
                            +  "\n" + currentWeather.getDesc()
                            + "\n\n\nPress any key to return.";
        
        System.out.println("\n" + this.displayMessage);
        this.getInput();
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
    
}
