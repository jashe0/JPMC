public class Main {
    public static void main(String[] args) {
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was neither was not 1, 2, 3, 4 nor 5");
        }
    }
}

