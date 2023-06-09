public class Main {

    public static int getEvenDigitSum(int number){

        int sum = 0;

        if(number < 0){
            return -1;
        }

        while(number > 0){
            if(number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }

        return sum;

    }
}
