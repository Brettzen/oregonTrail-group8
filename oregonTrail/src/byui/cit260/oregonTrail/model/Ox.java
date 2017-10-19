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

/**
 *
 * @author Brett Starks
 */
public class Ox {
    
    private int currentHealth;
    private int maxHealth;
    private int pullStrength;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getPullStrength() {
        return pullStrength;
    }

    public void setPullStrength(int pullStrength) {
        this.pullStrength = pullStrength;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.currentHealth;
        hash = 97 * hash + this.maxHealth;
        hash = 97 * hash + this.pullStrength;
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
        final Ox other = (Ox) obj;
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (this.maxHealth != other.maxHealth) {
            return false;
        }
        if (this.pullStrength != other.pullStrength) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ox{" + "currentHealth=" + currentHealth + ", maxHealth=" + maxHealth + ", pullStrength=" + pullStrength + '}';
    }
    
    
    
}
