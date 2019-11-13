public class SportmasterBonusService {
    public int calculateBonus(int allPurchases, int purchase) {
        int minPurchaseBonus = 1_000;
        int minBlueAllPurchase = 1;
        if (purchase<minPurchaseBonus) {
            return 0;
        }
        if (allPurchases<minBlueAllPurchase) {
            return 0;
        }

        int maxBlueAllPurchase = 15_000;
        int maxSilverAllPurchase = 150_000;
        int blueBonusCard = 50;
        int silverBonusCard = 70;
        int goldBonusCard = 100;

        if (allPurchases <= maxBlueAllPurchase) {
            return purchase / minPurchaseBonus * blueBonusCard;
        }
        if (allPurchases <= maxSilverAllPurchase){
            return purchase / minPurchaseBonus * silverBonusCard;
        }
        return purchase / minPurchaseBonus * goldBonusCard;
    }
}
