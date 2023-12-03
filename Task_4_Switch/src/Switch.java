public class Switch {
    public enum TypeError {
        LOGIC_ERROR,
        RUNTIME_ERROR,
        STACKOVERFLOW_ERROR
    }
    public static void main(String[] args) {
        int number = 1;
        char character = 'a';
        String str = "qwerty";
        TypeError error = TypeError.STACKOVERFLOW_ERROR;

        SwitchInt(number);
        SwitchChar(character);
        SwitchStr(str);
        SwitchEnum(error);

    }
    public static void SwitchInt(int number) {
        switch (number) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
        }
    }
    public static void SwitchChar(char character) {
        switch (character) {
            case 'a':
                System.out.println("Case a");
                break;
            case 'b':
                System.out.println("Case b");
                break;
            default:
                System.out.println("Default case");
        }
    }
    public static void SwitchStr(String str) {
        switch (str) {
            case "йцукен":
                System.out.println("Case йцукен");
                break;
            case "qwerty":
                System.out.println("Case qwerty");
                break;
            default:
                System.out.println("Default case");
        }
    }
    public static void SwitchEnum(TypeError error) {
        switch (error) {
            case LOGIC_ERROR:
                System.out.println("Case LOGIC_ERROR");
                break;
            case RUNTIME_ERROR:
                System.out.println("Case RUNTIME_ERROR");
                break;
            case STACKOVERFLOW_ERROR:
                System.out.println("Case STACKOVERFLOW_ERROR");
                break;
            default:
                System.out.println("Default case");
        }
    }
}