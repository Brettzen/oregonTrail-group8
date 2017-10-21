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
    private Scene scene;
    private int riverDepth;

    public RiverScene() {
        
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(int riverDepth) {
        this.riverDepth = riverDepth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.scene);
        hash = 13 * hash + this.riverDepth;
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
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "scene=" + scene + ", riverDepth=" + riverDepth + '}';
    }

  
   
}
