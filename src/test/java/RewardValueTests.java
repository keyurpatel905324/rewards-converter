import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; // Conversation rate
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;//Conversation rate
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
}
