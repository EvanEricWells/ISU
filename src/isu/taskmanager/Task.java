package isu.taskmanager;

public class Task {

    public static String description;
    public static String name;
    
    public Task(String nm, String d){
        name=nm;
        description=d;
    }

    public String getDescription(){
        return description;
    }
    
    public String getName(){
        return name;
    }
    
    public static void setDescription(String d){
        description=d;
    }
    
    public static void setName(String nm){
        name = nm;
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