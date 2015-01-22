package isu.taskmanager;

public class Task {

    public String description;
    public String name;
    
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
    
    public void setDescription(String d){
        description=d;
    }
    
    public void setName(String nm){
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