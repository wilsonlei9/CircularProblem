import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int solution = circular(n);
        System.out.println("The last remaining number is: " + solution);
    }

    public static int circular(int n) {

        int p = 1;
        while (p <= n) {
            p = p * 2;
        }

        p = p / 2;
        return (n - p) * 2 + 1;
    }

}


