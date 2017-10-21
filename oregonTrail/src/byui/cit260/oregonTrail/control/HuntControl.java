/*

 */
package byui.cit260.oregonTrail.control;

/**
 *
 * @author J.R. Basham
 */
public class HuntControl {
    
    public int calcHuntSuccess(int charHuntingSkill, int wildLifeAmount, float charStamina) {
        float amountFood;
        if ((charHuntingSkill <= 0) || (charHuntingSkill > 10)){ 
               return -1;
        } else if (wildLifeAmount < 10) {
               return -1;
        } else if ((charStamina <= 0) || (charStamina > 1)){
               return -1;
        } else {
            float newWildLifeAmount = wildLifeAmount * charStamina;  
            newWildLifeAmount = newWildLifeAmount / charHuntingSkill;
            amountFood = newWildLifeAmount * 5;
            amountFood = Math.round(amountFood);
        }
        return (int) amountFood;
    }
    
}
