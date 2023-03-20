public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "Not") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "Not ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "Not ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "Not") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "Not ") + "a prime number");
        System.out.println("28 is " + (isPrime(28) ? "" : "Not ") + "a prime number");

        int counter = 0;
        for (int i = 30; i < 100; i++) {
            if (isPrime(i) == true) {
                counter++;
                if(counter > 3){
                    break;
                }
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor <= wholeNumber / 2 ; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
