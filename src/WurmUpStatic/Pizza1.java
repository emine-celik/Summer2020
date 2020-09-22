package WurmUpStatic;

public class Pizza1 {

    String size;
    int numOfCheeseTop;
    int numPepTop;

    public Pizza1(String size,int numOfCheeseTop, int numPepTop){
        this.size=size;
        this.numOfCheeseTop=numOfCheeseTop;
        this.numPepTop=numPepTop;
    }

    public double calCost(){
        if(size.equalsIgnoreCase("Small")){
            return (numPepTop*2)+(numOfCheeseTop*2)+10;

        }else if(size.equalsIgnoreCase("medium")){
            return (numPepTop*2)+(numOfCheeseTop*2)+12;
        }else{
            return (numPepTop*2)+(numOfCheeseTop*2)+14;
        }
    }

    public String toString(){
        return "Size: "+size+"\nNumber Of Chees Pizza: "+numOfCheeseTop+"\nNumber Of Peporoni Pizza: "+numPepTop+"\nTotal Cost: "+calCost();
    }
}
