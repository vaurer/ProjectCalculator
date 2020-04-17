package va.CC;

public class RemainingRangeCalculator extends Calculator {

    public RemainingRangeCalculator() {
    }

    public double remainingRange(double restFuel, double consumption) {

        double remainingRange = Math.round(divide(restFuel, consumption) * 100);
        System.out.println("Remaining range with " + restFuel + " L, is " + remainingRange + " KM");
        return remainingRange;
    }

}
