package EmergencyRoom;


public class Patient {
    String name;
    String Condition;
    
    public Patient(String name, int priority){
        name=name;
        if(priority==0){
            Condition="Critical";
        }
        else if(priority==1){
            Condition="Serious";
        }
        else if(priority==2){
            Condition="Fair";
        }
        else{
            Condition = "Not Entered";
        }
    }
    
    public String toString(){
        String io = name + " (Condition: "+Condition + ")";
        return io;
    }
}
