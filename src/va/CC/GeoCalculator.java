package va.CC;

public class GeoCalculator extends Calculator {
    public GeoCalculator() {
    }

    public void circleArea(double radius) {
        double rSqare = multiply(radius, radius);
        double circleArea = multiply(3.14, rSqare);
        System.out.println("Area of the circle with the radius of " + radius + " is " + circleArea);
    }
    public void circleDiameter(double radius) {
        double circleDiameter = multiply(2, radius);
        System.out.println("Diameter of the circle with the radius of " + radius + " is " + circleDiameter);
    }
    public void circleCircumference(double radius) {
        double radiusPi = multiply(radius, 3.14);
        double circleCircumference = multiply(radiusPi, 2);
        System.out.println("Circumference of the circle with the radius of " + radius + " is " + circleCircumference);
    }
}
