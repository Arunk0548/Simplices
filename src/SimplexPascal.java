import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Arun Kumar
 */
public class SimplexPascal {

    public static BigInteger binomialCoeff(int n, int k) {
        BigInteger res = new BigInteger("1");
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res = res.multiply(new BigInteger(String.valueOf(n - i)));
            res = res.divide(new BigInteger(String.valueOf(i + 1)));
        }
        return res;
    }

    public static void findfaces(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("%s ", binomialCoeff(n, i)));
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of dimensions (0 to 100):");
        String dimensions = scanner.nextLine();

        if (dimensions.matches("([0-9]{1,2}?|100)")) {
            SimplexPascal.findfaces(Integer.valueOf(dimensions) + 1);
        } else {
            System.out.println("Invalid input! please enter the number of dimensions (0 to 100)");
        }

    }
}
