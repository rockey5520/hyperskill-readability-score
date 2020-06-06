import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        Double p = (a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}