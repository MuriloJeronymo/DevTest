public class RemoveWhiteSpaces {

    public static String removeSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!Character.isWhitespace(currentChar)) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "A E I O U";
        String textWithoutSpaces = removeSpaces(text);
        System.out.println("Texto original:  '" + text + "'");
        System.out.println("Texto sem espaços: '" + textWithoutSpaces + "'");
    }
}
