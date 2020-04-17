package va.CC;

public class CurrencyConverter extends Calculator {

    private double EUR = 1;
    private double USD = 1.09;
    private double GBP = 0.87;
    private double CHF = 1.05;

    public CurrencyConverter() {
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getCHF() {
        return CHF;
    }

    public void setCHF(double CHF) {
        this.CHF = CHF;
    }

    public void currencyConvert(double amount) {
            double USD = Math.round(multiply(amount, this.USD));
            double CHF = Math.round(multiply(amount, this.CHF));
            double GBP = Math.round(multiply(amount, this.GBP));
            System.out.println(amount + "EUR = " + USD + " USD");
            System.out.println(amount + "EUR = " + CHF + " CHF");
            System.out.println(amount + "EUR = " + GBP + " GBP");
    }
}
