import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterBonusServiceTest {
    @Test
    void calculateBonusUnderPurchaseBonus(){
        SportmasterBonusService service = new SportmasterBonusService();
        int allPurchases = 10_000;
        int purchase = 800;

        int result = service.calculateBonus(allPurchases, purchase);
        assertEquals(0,result);
    }

    @Test
    void calculateBonusForBlueCard(){
        SportmasterBonusService service = new SportmasterBonusService();
        int allPurchases = 10_000;
        int purchase = 1_800;

        int result = service.calculateBonus(allPurchases, purchase);
        assertEquals(50,result);
    }

    @Test
    void calculateBonusForSilverCard(){
        SportmasterBonusService service = new SportmasterBonusService();
        int allPurchases = 100_000;
        int purchase = 1_800;

        int result = service.calculateBonus(allPurchases, purchase);
        assertEquals(70,result);
    }

    @Test
    void calculateBonusForGoldCardAndOverPurchaseBonus(){
        SportmasterBonusService service = new SportmasterBonusService();
        int allPurchases = 1_220_000;
        int purchase = 28_000;

        int result = service.calculateBonus(allPurchases, purchase);
        assertEquals(2_800,result);
    }

}