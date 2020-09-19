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
    }
    public static String checkLang(String greeting) {
        switch (greeting) {
            case "Hello":
                return "English";
            case "Bonjour":
                return "French";
            case "Hola":
                return "Spanish";
            default:
                return "Unidentified";
        }
    }
}
