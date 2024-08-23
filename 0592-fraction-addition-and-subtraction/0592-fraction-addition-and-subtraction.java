import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String fractionAddition(String expression) {
        int numerator = 0, denominator = 1;

        Pattern pattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group(1));
            int den = Integer.parseInt(matcher.group(2));

            // Compute the new numerator and denominator
            numerator = numerator * den + num * denominator;
            denominator *= den;

            // Simplify the fraction
            int gcdVal = gcd(Math.abs(numerator), Math.abs(denominator));
            numerator /= gcdVal;
            denominator /= gcdVal;
        }

        // Ensure the denominator is positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
