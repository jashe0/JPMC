import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         double sum = 0;

         for (int i = 1; i <= 5; i++){
             try{
                 System.out.println("Enter number #"+i);
                 String userValue = scanner.nextLine();
                 double userNumber = Double.parseDouble(userValue);
                 sum  += userNumber;
             } catch (NumberFormatException n){
                 System.out.println("Invalid Number");
             }
         }

         System.out.println("The final sum is : "+sum);
    }
}
