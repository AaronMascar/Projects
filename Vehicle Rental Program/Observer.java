
package vehiclerentalprogram;

public class Observer {
    private String message;
    public void update(String theMessage){
        this.message=theMessage;
    }
    public String getMessage(){
        return message;
    }
}
