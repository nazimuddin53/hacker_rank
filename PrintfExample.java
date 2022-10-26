
import java.util.Scanner;

public class PrintfExample {

    public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);

            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1 = sc.nextLine();
                int x = sc.nextInt();
                sc.nextLine();
                String number = String.valueOf(x);
                if(number.length() <= 1){
                    number = "00" + number;
                }
                if(number.length()<= 2){
                    number = "0" + number;
                }
                //Complete this line 
                System.out.printf("%-14s       %-15s       %n",s1,number);
                
            }sc.close();
            System.out.println("================================");

    }
    
}
