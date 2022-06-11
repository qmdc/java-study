package 接口.two;

import java.math.BigInteger;
public class TestRantional {
    public static void main(String[] args) {
        Rational rational1 = new Rational(new BigInteger(14 + ""),
                new BigInteger(37 + ""));
        Rational rational2 = new Rational(new BigInteger(23 + ""),
                new BigInteger(67 + ""));
        System.out.println("14/37 + 23/67 = " + rational1.add(rational2));
        System.out.println("14/37 - 23/67 = " + rational1.subtract(rational2));
        System.out.println("14/37 * 23/67 = " + rational1.multiple(rational2));
        System.out.println("14/37 / 23/67 = " + rational1.divide(rational2));
    }
}


