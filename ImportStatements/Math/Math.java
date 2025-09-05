package ImportStatements.Math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Math {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("12345678901234567890");
        BigInteger bigNum2 = new BigInteger("98765432109876543210");
        BigInteger sum = bigNum1.add(bigNum2);

        System.out.println("BigInteger Sum: " + sum);

        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");
        BigDecimal total = price.multiply(quantity);

        System.out.println("BigDecimal Total: " + total);
    }
}
