package WurmUpStatic;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

 */
public class Restrant {
    ArrayList<Server>arrServers=new ArrayList<>();
    ArrayList<Chef>arrChefs=new ArrayList<>();

    String owner;
    String location;
    int numberOfStars;

public void setInfo(String owner,String location,int numberOfStars){
    this.owner=owner;
    this.location=location;
    this.numberOfStars=numberOfStars;
}
public void hireServer(Server newServer){
    arrServers.add(newServer);

}
public void hireServer(Server[] server){
    if(server.length==0){
        return;
    }
    arrServers.addAll(Arrays.asList(server));
}
public void hireServer(String name,int employeeId,double hourlyRate, boolean fullTime){
    Server newServer=new Server();
    newServer.setInfo(name,employeeId,hourlyRate,fullTime);
    arrServers.add(newServer);
}

public void hireChef(Chef newChef){
    arrChefs.add(newChef);

}
public void hireChef(Chef[] newChef2){
    if(newChef2.length==0){
        return;
    }
    arrChefs.addAll(Arrays.asList(newChef2));

}
    public void hireChef(String name,int employeeId,double hourlyRate, boolean fullTime) {
        Chef hireChef = new Chef();
        hireChef.setInfo(name,employeeId,hourlyRate,fullTime);
        arrChefs.add(hireChef);

    }

public void terminateServer( int employeeId){
    arrServers.removeIf(p-> p.employeeId==employeeId);

}
public void terminateChef(int employeeId){
    arrChefs.removeIf(p-> p.employeeId==employeeId);

}
public String toString(){
    return "Owner "+owner+" Location "+location+" Star "+numberOfStars+"\n In the Restaurant, there are: "+arrServers.size()+"\n servers "+arrChefs.size()+"\n chefs";
}

}
