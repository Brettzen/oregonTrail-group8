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

import byui.cit260.oregonTrail.control.PaceControl;
import byui.cit260.oregonTrail.model.Pace;

/**
 *
 * @author jgqui
 */
public class PaceView extends View {
    
    Pace currentPace = PaceControl.generatePace();
    
    public PaceView() {
        super("Press any key and hit return to go to previous menu");
        System.out.println("The pace you have choosen is: " + currentPace.getName());
        System.out.println(currentPace.getValue());
    }
    
    @Override
    public boolean doAction(String value) {
        return true;
    }
}
