package WurmUpStatic;
/*
 Create a class called Server

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                toString:

                                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"


 */

public class Server {

    String name;
    int employeeId;
    double hourlyRate;
    boolean fullTime;

    public void setInfo( String name,int employeeId,double hourlyRate, boolean fullTime){
        this.name=name;
        this.employeeId=employeeId;
        this.hourlyRate=hourlyRate;
        this.fullTime=fullTime;

    }
    public void takeOrder(){
        System.out.println(name+ " is taking an order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

    public void fulltime(boolean fullTime){
        if(fullTime){
            System.out.println("full-time");
        }else{
            System.out.println("Part-time");
        }
    }

    public String toString(){


        return "Name: "+name+" Employee Id: "+employeeId+" Hourly Rate"+hourlyRate+" is full Time: ?"+fullTime;
    }







}
