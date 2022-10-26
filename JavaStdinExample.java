import java.util.*;

public class JavaStdinExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); 
        double d = sc.nextDouble();

        // String s = new String(sc.nextLine());
        String s1 = sc.nextLine();
        sc.close();
        // Write your code here.
        
        // System.out.println("String: " + s);
        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}