/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregonTrail.model.Item;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.DailyTrailScene;
import byui.cit260.oregonTrail.model.FortScene;
import byui.cit260.oregonTrail.model.GatheringScene;
import byui.cit260.oregonTrail.model.HotelScene;
import byui.cit260.oregonTrail.model.HuntingScene;
import byui.cit260.oregonTrail.model.RiverScene;
import byui.cit260.oregonTrail.model.StoreScene;
import byui.cit260.oregonTrail.model.TownScene;
import byui.cit260.oregonTrail.model.Character;
import byui.cit260.oregonTrail.model.Party;
import byui.cit260.oregonTrail.model.Map;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Scene;



/**
 *
 * @author J.R. Basham, Jason Quibilan, Brett Starks
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
//        Testing our Player class
        Player playerOne = new Player();
        
        playerOne.setName("Jason");
        playerOne.setSkill("Hunter");
        playerOne.setStartingCurrency(50000);
        
        String playerOneName = playerOne.getName();
        String playerOneSkill = playerOne.getSkill();
        int playerOneStartingCurrency = playerOne.getStartingCurrency();
        
        System.out.println(playerOne.toString());
        
        
//        Testing our Enum Item
        String ammoName = Item.Ammo.getName();
        String ammoDescription = Item.Ammo.getDescription();
        int ammoWeight = Item.Ammo.getWeight();
        
        System.out.println(Item.Ammo.toString());
        
  
//                Testing DailyTrailScene
        DailyTrailScene newTrail = new DailyTrailScene ();
        newTrail.setCurrentPlantPresence(true);
        newTrail.setCurrentAnimalPresence(false);
        newTrail.setCurrentHazards(true);
        newTrail.setCurrentDate("Oct 6th 2017");
        newTrail.setCurrentWeather("Sunny");
        
        Boolean curPlants = newTrail.getCurrentPlantPresence();
        Boolean curAnimals = newTrail.getCurrentAnimalPresence();
        Boolean curHazards = newTrail.getCurrentHazards();
        String curDate = newTrail.getCurrentDate();
        String curWeather = newTrail.getCurrentWeather();
        System.out.println(newTrail.toString());
        
        //        Testing FortScene
        FortScene newFort = new FortScene ();
        System.out.println(newFort.toString());
        
        //        Testing RiverScene
        RiverScene newRiver = new RiverScene();
        newRiver.setRiverDepth(20);
        int curRiverDepth = newRiver.getRiverDepth();
        System.out.println(newRiver.toString());
        //        Testing FortScene
        TownScene newTown = new TownScene ();
        System.out.println(newTown.toString());
        
        //        Testing HotelScene
        HotelScene newHotel = new HotelScene ();
        System.out.println(newHotel.toString());
       
        //        Testing StoreScene
        StoreScene newStore = new StoreScene ();
        System.out.println(newStore.toString());
        
        //        Testing HuntingScene
        HuntingScene newHunt = new HuntingScene ();
        System.out.println(newHunt.toString());
        
        //        Testing GatheringScene
        GatheringScene newGat = new GatheringScene ();
        System.out.println(newGat.toString());
        
                //        Testing Scene
        Scene newScene = new Scene ();
        System.out.println(newScene.toString());
        
        //        Testing Character
        Character charOne = new Character();
        Character charTwo = new Character();
        
        charOne.setName("Montie");
        charOne.setDescription("A burly mountain man who has been hunting since the day he grew his first moustache: his third birthday.");
        charOne.setCurrentHealth(100);
        charOne.setMaxHealth(100);
        charOne.setStamina(8);
        charOne.setStatus("Healthy");
        charOne.setSkill("Hunter");
        charOne.setStartingCurrency(100);
        
        charTwo.setName("Lucas");
        charTwo.setDescription("A happy accountant with a mild stutter");
        charTwo.setCurrentHealth(100);
        charTwo.setMaxHealth(100);
        charTwo.setStamina(5);
        charTwo.setStatus("Healthy");
        charTwo.setSkill("Accountant");
        charTwo.setStartingCurrency(10000);
        
        System.out.println(charOne.toString());
                
                
        //        Testing Party
        Party party = new Party();
        
        party.addCharacter(charOne);
        party.addCharacter(charTwo);
        
        party.addItem(Item.Ammo);
        party.addItem(Item.WagonSmall);
        party.addItem(Item.Ammo);
        
        party.setCurrentMoney(
                playerOne.getStartingCurrency() +
                charOne.getStartingCurrency() + 
                charTwo.getStartingCurrency()
        );
        
        System.out.println(party.toString());
        
//        charOne.setCurrentHealth(80);
//        
//        party.checkCharacters();
        
        // testing Map
        
        Map map = new Map();
        System.out.println(map.toString());
        
        // testing Location
        
        Location location = new Location();
        System.out.println(location.toString());
        
    }
    
}
