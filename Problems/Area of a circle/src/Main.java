import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        System.out.println(Math.PI*radius*radius);
    }
}