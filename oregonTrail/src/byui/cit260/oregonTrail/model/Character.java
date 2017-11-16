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
public class Character implements Serializable {
    
    
    private String name;
    private String description;
    private int skill;
    private String status;
    private int currentHealth;
    private int maxHealth;
    private int stamina;
    private int startingCurrency = 0;
    private Party party;
    private ArrayList<Player> players = new ArrayList<>();
    
    
    
    public Character() {
    }
    
    public Character(String name, String description, int skill, String status, int currentHealth, int maxHealth, int stamina, int startingCurrency) {
        this.name = name;
        this.description = description;
        this.skill = skill;
        this.status = status;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.stamina = stamina;
        this.startingCurrency = startingCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStartingCurrency() {
        return startingCurrency;
    }

    public void setStartingCurrency(int startingCurrency) {
        this.startingCurrency = startingCurrency;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.skill);
        hash = 89 * hash + Objects.hashCode(this.status);
        hash = 89 * hash + this.currentHealth;
        hash = 89 * hash + this.maxHealth;
        hash = 89 * hash + this.stamina;
        hash = 89 * hash + this.startingCurrency;
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
        final Character other = (Character) obj;
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (this.maxHealth != other.maxHealth) {
            return false;
        }
        if (this.stamina != other.stamina) {
            return false;
        }
        if (this.startingCurrency != other.startingCurrency) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.skill, other.skill)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", skill=" + skill + ", status=" + status + ", currentHealth=" + currentHealth + ", maxHealth=" + maxHealth + ", stamina=" + stamina + ", startingCurrency=" + startingCurrency + '}';
    }
    
    
}