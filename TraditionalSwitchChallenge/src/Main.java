public class Main {
    public static void main(String[] args) {
        char letter = 'b';

        switch (letter){
            case 'a':
                System.out.println(letter+" is Alpha in the NATO alphabet");
                break;
            case  'b':
                System.out.println(letter+" is Bravo in the NATO alphabet");
                break;
            case  'c':
                System.out.println(letter+" is Charlie in the NATO alphabet");
                break;
            case 'd':
                System.out.println(letter+" is Delta in the NATO alphabet");
                break;
            case 'e':
                System.out.println(letter+" is Echo in the NATO alphabet");
                break;
            default:
                System.out.println("Letter not found");

        }

    }
}
