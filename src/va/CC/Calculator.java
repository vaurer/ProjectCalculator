package va.CC;

public class Calculator {

    public Calculator() {
    }

    public double plus(double x, double y) {
        double plus = x + y;
        //System.out.println(x + " + " + y + " = " + plus);
        return plus;
    }

    public double minus(double x, double y) {
        double minus = x - y;
        //System.out.println(x + " - " + y + " = " + minus);
        return minus;
    }

    public double divide(double x, double y) {
        double divide = x / y;
        //System.out.println(x + " / " + y + " = " + divide);
        return divide;
    }

    public double multiply(double x, double y) {
        double multiply = x * y;
        //System.out.println(x + " x " + y + " = " + multiply);
        return multiply;
    }
}
