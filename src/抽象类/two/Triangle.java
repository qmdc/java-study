package 抽象类.two;

public class Triangle extends Shape {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double p = (getA() + getB() + getC()) / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }

    @Override
    public double perimeter() {
        return getA() + getB() + getC();
    }
}
