/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

/**
 *
 * @author jgqui
 */
public enum Item {
    
    Oxen("Oxen", "Strong and powerful beast that can pull wagons up to 1000 lbs.", 1000),
    WagonSmall("WagonSmall", "Small wagon that can carry minimal amount of supplies.", 200),
    WagonMedium("WagonMedium", "Medium wagon that can carry an average amount of supplies.", 400),
    WagonLarge("WagonLarge", "Large wagon that can carry a maximum amount of supplies.", 600),
    Food("Food", "Delicious consumables for nourishment.", 20),
    Ammo("Ammo", "Bullets for hunting or protection.", 5),
    Wheel("Wheel", "Spare wheels, just in case.", 40);
   
    
    private String name;
    private String description;
    private int weight;

    Item(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
    
      public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", weight=" + weight + '}';
    }
    
}
