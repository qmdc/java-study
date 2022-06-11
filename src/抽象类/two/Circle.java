package 抽象类.two;

public class Circle extends Shape {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getDiameter() / 2, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * getDiameter();
    }
}
