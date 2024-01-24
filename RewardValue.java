public class RewardValue {

    private double cashValue;
    private double milesValue;

  
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }
 
    public double getCashValue() {
        return cashValue;
    }
 
    public double getMilesValue() {
        return milesValue;
    }
 
    private double convertToMiles(double cashValue) {
        return cashValue * 0.0035;
    } 
    private double convertToCash(double milesValue) {
        return milesValue / 0.0035;
    }

    public static void main(String[] args) {

        RewardValue cashReward = new RewardValue(100.0);
        System.out.println("Cash Value: " + cashReward.getCashValue());
        System.out.println("Miles Value: " + cashReward.getMilesValue());

        RewardValue milesReward = new RewardValue(350.0, true);
        System.out.println("Cash Value: " + milesReward.getCashValue());
        System.out.println("Miles Value: " + milesReward.getMilesValue());
    }
}