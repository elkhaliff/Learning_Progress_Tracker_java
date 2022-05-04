package tracker;

import java.util.regex.Pattern;

public class Student {
    int id;
    private String firstName;
    private String lastName;
    private String email;

    private int pointJava;
    private int pointDSA;
    private int pointDB;
    private int pointSpring;

    public Student(int id) {
        this.id = id;
        pointJava = 0;
        pointDSA = 0;
        pointDB = 0;
        pointSpring = 0;
    }

    public String getEmail() {
        return email;
    }

    private boolean testString(String input) {
        for (String sl: input.split(" ")) {
            if (sl.length() < 2) return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+([ '\\-]*[a-zA-Z]*)*");
        Pattern patternNot = Pattern.compile("(\\w*''\\w*)|(\\w*-'\\w*)|(\\w*'-\\w*)|(\\w*--\\w*)|('\\w)|(\\w+')|(-\\w)|(\\w+-)");
        return !patternNot.matcher(input).matches() && pattern.matcher(input).matches();
    }

    private boolean testEmail(String input) {
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

    public void setPoints(int[] arrPoints) {
        int i = 0;
        pointJava += arrPoints[i++];
        pointDSA += arrPoints[i++];
        pointDB += arrPoints[i++];
        pointSpring += arrPoints[i];
    }

    @Override
    public String toString() {
        return String.format("%d points: Java=%d DSA=%d Databases=%d Spring=%d\n", id, pointJava, pointDSA, pointDB, pointSpring);
    }
}
