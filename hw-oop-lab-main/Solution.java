import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // output
        System.out.println("a = " +  (A*B - C*D ));
        System.out.println("b = "+ (2*A - B + 3*D));
        // System.out.println("c = "+ ( A*A + B*B - C*C + D*D));
        System.out.println("C = "+ (Math.pow(A, 2) + Math.pow(B, 2) - Math.pow(C, 2) + Math.pow(D, 2)));
        // System.out.println("d = "+ (A*A*A + B - C*C));
        System.out.println("d = "+ (Math.pow(A, 3) + B - Math.pow(C, 2)));
    }
}