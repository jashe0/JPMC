public class Main {
    public static boolean isPalindrome(int number){

        if (number < 0){
            number *= -1;
        }

        int reverse = 0;
        int storedNumber = number;

        while(storedNumber > 0){
            int lastDigit = storedNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            storedNumber /= 10;
        }

        if(number == reverse){
            return true;
        }else{
            return false;
        }
    }
}


