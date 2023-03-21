public class Main {
    public static void main(String[] args) {

        System.out.println("Sum of digits in number 1234 = "+ sumDigits(1234));
        System.out.println("Sum of digits in number -125 = "+ sumDigits(-125));
        System.out.println("Sum of digits in number 4 = "+ sumDigits(4));
        System.out.println("Sum of digits in number 32123 = "+ sumDigits(32123));
    }

    public static int sumDigits(int number){

        int sum = 0;

        if(number > 0){
            while(number > 9) {
                sum += (number % 10);
                number = number / 10;
            }
            sum += number;
            return sum;
        }else{
            return -1;
        }
    }
}
