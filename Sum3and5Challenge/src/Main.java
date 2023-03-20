public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int totalSum = 0;

         for(int i=1; i <=1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                counter++;
                totalSum += i;
                System.out.println(i);
            }
            if(counter == 5){
                System.out.println("total sum of numbers  = "+totalSum);
                break;
            }
        }
    }
}
