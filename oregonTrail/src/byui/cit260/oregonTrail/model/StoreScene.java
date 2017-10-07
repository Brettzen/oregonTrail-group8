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
public class StoreScene implements Serializable {
    private DailyTrailScene dailyTrailScene;
    private ArrayList<Item> itemList;
    private String description = "This is the Store Scene.";
    
    public StoreScene() {
       
    }

    public DailyTrailScene getDailyTrailScene() {
        return dailyTrailScene;
    }

    public void setDailyTrailScene(DailyTrailScene dailyTrailScene) {
        this.dailyTrailScene = dailyTrailScene;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
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
        hash = 97 * hash + Objects.hashCode(this.itemList);
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
        final StoreScene other = (StoreScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dailyTrailScene, other.dailyTrailScene)) {
            return false;
        }
        if (!Objects.equals(this.itemList, other.itemList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreScene{" + "dailyTrailScene=" + dailyTrailScene + ", itemList=" + itemList + ", description=" + description + '}';
    }

    
}
