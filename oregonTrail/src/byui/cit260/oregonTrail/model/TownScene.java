/*

 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author J.R. Basham
 */
public class TownScene implements Serializable{
    private DailyTrailScene dailyTrailScene;
    private String description = "This is the Town Scene.";
    public TownScene (){
    
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dailyTrailScene);
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final TownScene other = (TownScene) obj;
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
        return "TownScene{" + "dailyTrailScene=" + dailyTrailScene + ", description=" + description + '}';
    }
    
}
