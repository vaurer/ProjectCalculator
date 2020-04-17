package va.CC;

public class TaxCalculator extends Calculator {
    double AT = 20;
    double DE = 19;
    double IT = 22;
    double CH = 7.7;

    public TaxCalculator() {
    }

    public double getAT() {
        return AT;
    }

    public void setAT(double AT) {
        this.AT = AT;
    }

    public double getDE() {
        return DE;
    }

    public void setDE(double DE) {
        this.DE = DE;
    }

    public double getIT() {
        return IT;
    }

    public void setIT(double IT) {
        this.IT = IT;
    }

    public double getCH() {
        return CH;
    }

    public void setCH(double CH) {
        this.CH = CH;
    }

    public void calculateTax(double amount) {
        double AT = divide(amount, 100)*this.AT;
        double DE = divide(amount, 100)*this.DE;
        double IT = divide(amount, 100)*this.IT;
        double CH = divide(amount, 100)*this.CH;
        System.out.println("On " + amount + " EUR, there is additionally " + AT + " EUR of VAT to be paid in Austria");
        System.out.println("On " + amount + " EUR, there is additionally " + DE + " EUR of VAT to be paid in Germany");
        System.out.println("On " + amount + " EUR, there is additionally " + IT + " EUR of VAT to be paid in Italy");
        System.out.println("On " + amount + " EUR, there is additionally " + CH + " EUR of VAT to be paid in Switzerland");
    }
}
