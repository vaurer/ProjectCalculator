package va.CC;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.plus(5, 9);
        calculator.multiply(5.14, 3.14);
        calculator.divide(5.12, 3.5);
        calculator.minus(522, 311.472);

        RemainingRangeCalculator remainingRangeCalculator = new RemainingRangeCalculator();
        remainingRangeCalculator.remainingRange(27.5,5.4);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.currencyConvert(100);

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax(100);
    }
}
