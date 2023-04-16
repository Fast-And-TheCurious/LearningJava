package Backend;

import java.util.Random;

public class StringUtility {

    public static boolean hasDoubleLetter(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static String Email(String name) {
        //Split the name into first, middle, and last names
        String[] names = name.split(" ");
        String firstName = names[0];
        String middleName = "";
        String lastName = names[names.length - 1];
        if (names.length > 2) {
            middleName = names[1];
        }

        // Generate the email address
        String email = lastName.substring(0, 3) + firstName.substring(0, 3);

        // Generate a random 3-digit number
        Random rand = new Random();
        int num = rand.nextInt(900) + 100;

        email += num + "@gmail.com";

        return email;
    }

    public static boolean isStrongPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-+";
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }
        return true;
    }

    public static String Modernizer(String input) {

        String lowerInput = input.toLowerCase();

        String output = "";
        for (char c : lowerInput.toCharArray()) {
            switch (c) {
                case 'e':
                    output += "3";
                    break;
                case 't':
                    output += "7";
                    break;
                case 's':
                    output += "5";
                    break;
                case 'i':
                    output += "1";
                    break;
                case 'o':
                    output += "0";
                    break;
                default:
                    output += c;
            }
        }

        return output;
    }

    public static String johnReplaceP(String input) {
        int index = input.indexOf("John");

        if (index >= 0) {
            input = input.substring(0, index) + "Peter" + input.substring(index + 4);
        }
        return input;
    }

    public static String DateConvert(String date) {

        String year = date.substring(2, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);

        return day + "/" + month + "/" + year;
    }

    public static String countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;
        String output = "";

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Ignore spaces
            if (c == ' ') {
                continue;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        output = "There are " + vowels + " vowels and " + consonants + " consonants.";
        return output;
    }

    public static String generateStrongPassword() {
        Random random = new Random();
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitChars = "0123456789";
        String specialChars = "!@#$%&";

        String password = "";

        while (true) {
            // Generate 8-16 character length
            int length = random.nextInt(9) + 8;

            // Generate at least one lowercase, uppercase, digit, and special character
            boolean hasLowercase = false;
            boolean hasUppercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (int i = 0; i < length; i++) {
                int type = random.nextInt(4);
                char c;

                switch (type) {
                    case 0: // lowercase
                        c = lowercaseChars.charAt(random.nextInt(lowercaseChars.length()));
                        hasLowercase = true;
                        break;
                    case 1: // uppercase
                        c = uppercaseChars.charAt(random.nextInt(uppercaseChars.length()));
                        hasUppercase = true;
                        break;
                    case 2: // digit
                        c = digitChars.charAt(random.nextInt(digitChars.length()));
                        hasDigit = true;
                        break;
                    case 3: // special character
                        c = specialChars.charAt(random.nextInt(specialChars.length()));
                        hasSpecialChar = true;
                        break;
                    default:
                        c = ' ';
                        break;
                }

                password += c;
            }

            if (hasLowercase && hasUppercase && hasDigit && hasSpecialChar) {
                break;
            }

            password = "";
        }

        return password;
    }
}
