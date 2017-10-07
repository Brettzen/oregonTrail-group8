/*

 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author J.R. Basham
 */
public class GatheringScene implements Serializable{
    private DailyTrailScene dailyTrailScene;
    private int plantLifeAmount;
    private String description = "This is the Gathering Scene.";

    public GatheringScene() {
        
    }

    public DailyTrailScene getDailyTrailScene() {
        return dailyTrailScene;
    }

    public void setDailyTrailScene(DailyTrailScene dailyTrailScene) {
        this.dailyTrailScene = dailyTrailScene;
    }

    public int getPlantLifeAmount() {
        return plantLifeAmount;
    }

    public void setPlantLifeAmount(int plantLifeAmount) {
        this.plantLifeAmount = plantLifeAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.dailyTrailScene);
        hash = 47 * hash + this.plantLifeAmount;
        hash = 47 * hash + Objects.hashCode(this.description);
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
        final GatheringScene other = (GatheringScene) obj;
        if (this.plantLifeAmount != other.plantLifeAmount) {
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
        return "GatheringScene{" + "dailyTrailScene=" + dailyTrailScene + ", plantLifeAmount=" + plantLifeAmount + ", description=" + description + '}';
    }

   
}
