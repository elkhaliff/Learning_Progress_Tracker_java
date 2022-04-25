package tracker;

import java.util.regex.Pattern;

public class Student {
    private String firstName;
    private String lastName;
    private String email;

    private static boolean testString(String input) {
        for (String sl: input.split(" ")) {
            if (sl.length() < 2) return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+([ '\\-]*[a-zA-Z]*)*");
        Pattern patternNot = Pattern.compile("(\\w*''\\w*)|(\\w*-'\\w*)|(\\w*'-\\w*)|(\\w*--\\w*)|('\\w)|(\\w+')|(-\\w)|(\\w+-)");
        return !patternNot.matcher(input).matches() && pattern.matcher(input).matches();
    }

    private static boolean testEmail(String input) {
        Pattern pattern = Pattern.compile("[\\w.]+@\\w+\\.\\w+");
        return pattern.matcher(input).matches();
    }

    public boolean setFirstName(String firstName) {
        if (!testString(firstName)) return false;
        this.firstName = firstName;
        return true;
    }

    public boolean setLastName(String lastName) {
        if (!testString(lastName)) return false;
        this.lastName = lastName;
        return true;
    }

    public boolean setEmail(String email) {
        if (!testEmail(email)) return false;
        this.email = email;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s\n", firstName, lastName, email);
    }
}
