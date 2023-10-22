
package lesson10_1main;

public class Chair {
    private String type;
    
    //constructor method
        public Chair(){
            type = "no type";
    }     
    
        public Chair(String tt){
            type = tt;
    }
    
        public void print (){
            System.out.println("Chair type is :" +type);
            System.out.println("Chair price is :" +price);
    }

    public void print(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
