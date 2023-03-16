public class Main {
    public static void main(String[] args) {
        double firstHeight = convertToCentimeters(68 );
        System.out.println(firstHeight);
        double secondHeight = convertToCentimeters(5,8);
        System.out.println(secondHeight);
    }

    public static double convertToCentimeters(int inch){
        return inch*2.54;
    }

    public static double convertToCentimeters(int feet,int inches){
        double feetCm = feet*30.48;
        double inch = convertToCentimeters(inches);
        double feetAndInches = feetCm+inch;
        return feetAndInches;
    }
}
