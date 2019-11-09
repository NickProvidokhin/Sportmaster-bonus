public class SportmasterBonusService {
    public int calculateBonus(int allPurchases, int purchase) {
        int blueBonusCard = 50;
        int silverBonusCard = 70;
        int goldBonusCard = 100;
        int minPurchaseBonus = 1_000;

        int minBlueAllPurchase = 1;
        int maxBlueAllPurchase = 15_000;
        int minSilverAllPurchase = 15_001;
        int maxSilverAllPurchase = 150_000;
        int bonus = 0;
        if (purchase<1000){
            return bonus;
        }
        if (minBlueAllPurchase <= allPurchases && allPurchases <= maxBlueAllPurchase) {
            bonus= purchase / minPurchaseBonus * blueBonusCard;
        }
        else if (minSilverAllPurchase <= allPurchases && allPurchases <= maxSilverAllPurchase){
            bonus= purchase / minPurchaseBonus * silverBonusCard;
        }
        else if (allPurchases > maxSilverAllPurchase){
            bonus= purchase / minPurchaseBonus * goldBonusCard;
        }
        return bonus;
    }
}
