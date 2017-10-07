/*

 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author J.R. Basham
 */
public class HuntingScene implements Serializable{
    private DailyTrailScene dailyTrailScene;
    private int wildLifeAmount;
    private String description = "This is the Hunting Scene.";
    private ArrayList<Item> item;
    
    public HuntingScene () {
    
    }

    public DailyTrailScene getDailyTrailScene() {
        return dailyTrailScene;
    }

    public void setDailyTrailScene(DailyTrailScene dailyTrailScene) {
        this.dailyTrailScene = dailyTrailScene;
    }

    public int getWildLifeAmount() {
        return wildLifeAmount;
    }

    public void setWildLifeAmount(int wildLifeAmount) {
        this.wildLifeAmount = wildLifeAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.dailyTrailScene);
        hash = 29 * hash + this.wildLifeAmount;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.item);
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
        final HuntingScene other = (HuntingScene) obj;
        if (this.wildLifeAmount != other.wildLifeAmount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dailyTrailScene, other.dailyTrailScene)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HuntingScene{" + "dailyTrailScene=" + dailyTrailScene + ", wildLifeAmount=" + wildLifeAmount + ", description=" + description + ", item=" + item + '}';
    }
    
    
    
}
