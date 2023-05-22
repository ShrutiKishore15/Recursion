public class Strings {
    public static String replaceChar(String str, char org, char rep) {
        if (str.length() == 0) {
            return str;
        }
        String smallStr = replaceChar(str.substring(1), org, rep);
        if (str.charAt(0) == org) {
            return rep + smallStr;
        } else {
            return str.charAt(0) + smallStr;
        }
    }

    public static String removeX(String input) {
        if (input.length() == 0) {
            return input;
        }
        String smallInput = removeX(input.substring(1));
        if (input.charAt(0) == 'x') {
            return smallInput;
        } else {
            return input.charAt(0) + smallInput;
        }
    }

    public static String replaceStr(String str, String org, String rep) {
        if (str.length() <= 1) {
            return str;
        }
            if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
                String smallStr = replaceStr(str.substring(2), org, rep);
                return rep + smallStr;
            } else {
                String smallStr = replaceStr(str.substring(1), org, rep);
                return str.charAt(0) + smallStr;
            }

    }

    public static void main(String[] args) {
        System.out.println(replaceStr("Tpiokpivpigh", "pi", "3.14"));
    }
}
