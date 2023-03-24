import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(true){
            try{
                String userNumber = scanner.nextLine();
                int number = Integer.parseInt(userNumber);
                sum += number;
                counter++;
            } catch(NumberFormatException nfe){
                long average = 0;
                if(counter > 0){
                    average = Math.round((double)sum/counter);
                }
                System.out.println("SUM = "+sum+" AVG = "+average);
                break;
            }
        }
    }
}
