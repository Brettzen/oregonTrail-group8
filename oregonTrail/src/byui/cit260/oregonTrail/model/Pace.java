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
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Brett Starks
 */
//public enum Pace {
    
//    Slow("Slow", 0.5),
//    Average("Average", 1.0),
//    Fast("Fast", 1.5);
    
//    private final String name;
//    private final double value;

//    Pace(String name, double value) {
//        this.name = name;
//        this.value = value;
//    }

//    public String getName() {
//        return name;
//    }

//    public double getValue() {
//        return value;
//    }
    
//}
public class Pace implements Serializable {
    
    private ArrayList<Pace> currentPace = new ArrayList<>();
    private String speed;
    private int value;
    private Pace[] paces;
    
        
    public Pace(String speed, int value) {
        this.speed = speed;
        this.value = value;
    }
    
    public Pace(Pace[] paces) {  
        
    }
    
    public Pace() {
        
    }
    
    public ArrayList<Pace> getCurrentPace() {
        return currentPace;
    }
    
    public String getSpeed() {
        return speed;
    }
    
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public Pace[] getPaces() {
        return paces;
    }
    
    public void setPaces(Pace[] paces) {
        this.paces = paces;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.speed);
        hash = 79 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pace other = (Pace) obj;
        if (this.value != other.value) {
            return false;
        }
        if (!Objects.equals(this.speed, other.speed)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pace{" + "speed=" + speed + ", value=" + value + '}';
    }

    
    
}