/*

 */
package byui.cit260.oregonTrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author J.R. Basham
 */
public class HotelScene implements Serializable{
    private DailyTrailScene dailyTrailScene;
    private String description = "This is the HotelScene.";
    private ArrayList<Character> character;

    public HotelScene () {
    
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

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.dailyTrailScene);
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.character);
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
        final HotelScene other = (HotelScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dailyTrailScene, other.dailyTrailScene)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "dailyTrailScene=" + dailyTrailScene + ", description=" + description + ", character=" + character + '}';
    }
    
    
}
