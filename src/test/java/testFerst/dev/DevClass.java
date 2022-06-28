package testFerst.dev;

public class DevClass {
    public static String reverseWord(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        if (s.length() == 1) {

            throw new RuntimeException();
        }
        if (s.contains(" ")) {
            throw new IllegalArgumentException();
        }
        if (s.isEmpty()) {
            throw new RuntimeException();
        }
        char[] letters = s.toCharArray();
        char[] reversedLetters = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            reversedLetters[s.length() - i - 1] = letters[i];
        }
        String reversedS = new String(reversedLetters);
        return reversedS;
    }
    public static boolean logIn(String login, String password, String confirmPassword) {
        try {
            if (!(login.length() < 20 && isValidLogin(login))) {
                throw new WrongLoginException();
            }
        }
        catch (WrongLoginException e) {
            System.out.println("invalid login");
        }
        try {
            if (!(login.length() < 20 && isValidPassword(login) && password.equals(confirmPassword))) {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            System.out.println("invalid password");
        }
        return true;
    }

    private static boolean isValidLogin(String text) {

        for (int i = 0; i < text.length(); i++) {

            int currChar = text.charAt(i);

            if (!(currChar >= 48 && currChar <= 57 ||

                    currChar >= 65 && currChar <= 90 ||

                    currChar >= 97 && currChar <= 122 ||

                    currChar == 95)) {

                return false;
            }
        }
        return true;
    }
    private static boolean isValidPassword(String text) {

        return isValidLogin(text);
    }
}
