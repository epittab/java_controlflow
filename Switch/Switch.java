package ControlFlow.Switch;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        System.out.println(checkLang("Hello"));
        System.out.println(checkLang("Bonjour"));
        System.out.println(checkLang("Hola"));
        System.out.println(checkLang("Ciao"));
        checkLetter('A');
        checkLetter('C');
        checkLetter('D');
        checkLetter('H');
    }
    public static String checkLang(String greeting) {
        /* 
            if there were not returns, then it would use break
        */
        switch (greeting) {
            case "Hello":
                return "English";
            case "Bonjour":
                return "French";
            case "Hola":
                return "Spanish";
            default:
                return "Unidentified Language";
        }
    }

    public static void checkLetter(char letter){
        switch (letter){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Could not find the letter");
                break;
        }
    }
}
