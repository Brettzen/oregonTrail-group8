/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author J.R. Basham, Jason Quibilan, Brett Starks
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private String skill;
    private int startingCurrency = 0;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
    }
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getStartingCurrency() {
        return startingCurrency;
    }

    public void setStartingCurrency(int startingCurrency) {
        this.startingCurrency = startingCurrency;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.skill);
        hash = 97 * hash + this.startingCurrency;
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
        final Player other = (Player) obj;
        if (this.startingCurrency != other.startingCurrency) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.skill, other.skill)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", skill=" + skill + ", startingCurrency=" + startingCurrency + '}';
    }
    
}
