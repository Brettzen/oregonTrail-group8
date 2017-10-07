/*

 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author J.R. Basham
 */
public class RiverScene implements Serializable{
    private DailyTrailScene dailyTrailScene;
    private String description = "This is the River Scene.";
    private int riverDepth;

    public RiverScene() {
        
    }

    public DailyTrailScene getDailyTrailScene() {
        return dailyTrailScene;
    }

    public void setDailyTrailScene(DailyTrailScene dailyTrailScene) {
        this.dailyTrailScene = dailyTrailScene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(int riverDepth) {
        this.riverDepth = riverDepth;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.dailyTrailScene);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + this.riverDepth;
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
        final RiverScene other = (RiverScene) obj;
        if (this.riverDepth != other.riverDepth) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dailyTrailScene, other.dailyTrailScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "dailyTrailScene=" + dailyTrailScene + ", description=" + description + ", riverDepth=" + riverDepth + '}';
    }

    
}
