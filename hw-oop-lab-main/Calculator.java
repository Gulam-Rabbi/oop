import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // select Option
        switch(option){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b != 0){
                System.out.println(a/b);
            }else{
                System.out.println("Math Error");
            }
            break;
            default: System.out.println("Invalid Option");

        }
    }
}