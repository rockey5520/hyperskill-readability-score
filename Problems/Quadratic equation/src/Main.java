import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        double root1, root2;

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            double[] arr = new double[2];
            arr[0] = root1;
            arr[1] = root2;
            Arrays.sort(arr);
            System.out.println(arr[0]+" "+arr[1]);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            double[] arr = new double[2];
            arr[0] = root1;
            arr[1] = root2;
            Arrays.sort(arr);
            System.out.println(arr[0]+" "+arr[1]);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println(realPart+" "+imaginaryPart);
        }
    }
}