package isu.taskmanager;

public class Task {

    public static String description;
    public static String name;

    public static void main(String[] args) {

    }

    public boolean validate() {
        if (name == null || description == null || name.equals("") || description.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\n=========\n";
    }
}
