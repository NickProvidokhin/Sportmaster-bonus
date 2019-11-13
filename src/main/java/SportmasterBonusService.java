public class SportmasterBonusService {
    public int calculateBonus(int allPurchases, int purchase) {
        if (purchase<1000) {
            return 0;
        }

        int minBlueAllPurchase = 1;
        int maxBlueAllPurchase = 15_000;
        int minSilverAllPurchase = 15_001;
        int maxSilverAllPurchase = 150_000;
        int minPurchaseBonus = 1_000;

        if (allPurchases<minBlueAllPurchase) {
            return 0;
        }
        int blueBonusCard = 50;
        int silverBonusCard = 70;
        int goldBonusCard = 100;

        if (minBlueAllPurchase <= allPurchases && allPurchases <= maxBlueAllPurchase) {
            return purchase / minPurchaseBonus * blueBonusCard;
        }
        if (minSilverAllPurchase <= allPurchases && allPurchases <= maxSilverAllPurchase){
            return purchase / minPurchaseBonus * silverBonusCard;
        }
        return purchase / minPurchaseBonus * goldBonusCard;
    }
}
