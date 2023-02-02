import java.util.*;
public class Circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        double area = 3.1416*A*A;
        System.out.println("Area: "+ String.format("%.2f", area));
    }
}