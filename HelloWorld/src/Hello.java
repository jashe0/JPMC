public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim!");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Not an alien!");
            System.out.println("And I'm scared of aliens!");
        }

        int topScore = 80;
        if(topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sumOfDoubles = firstDouble  + secondDouble;
        double mutlipliedDoubles = sumOfDoubles * 100.00d;
        double dividedDoubles =  mutlipliedDoubles % 40.00d ;
        boolean isRemainder = dividedDoubles == 0.00 ? false: true;
        System.out.println(isRemainder);
        if(isRemainder){
            System.out.println("Got some remainder!");
        }

    }
}
