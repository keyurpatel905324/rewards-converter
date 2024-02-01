public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double CONVERSION_RATE = 0.0035; //Conversion Rate


    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue(){
        return this . cashValue;
    }

    public double getMilesValue(){
        return this.milesValue;
    }
}






