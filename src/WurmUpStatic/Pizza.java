package WurmUpStatic;
/*
1. Create a class named Pizza that stores information about a single pizza.
        Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping
 */
public class Pizza {

    String size;
    int numOfCheeseTop;
    int numPepTop;

    public void setInfo( String size,int numOfCheeseTop,int numPepTop){
        this.size=size;
        this.numOfCheeseTop=numOfCheeseTop;
        this.numPepTop=numPepTop;
    }

public double calCost(){
        if(size.equalsIgnoreCase("Small")){
            return (numPepTop*2)+(numOfCheeseTop*2)+10;
        }else if(size.equalsIgnoreCase("Medium")){
            return (numPepTop*2)+(numOfCheeseTop*2)+12;
        }else{
          return   (numPepTop*2)+(numOfCheeseTop*2)+14;
        }
}

    public String toString(){
        return "Size: "+size+"\nNumber Of Chees Pizza: "+numOfCheeseTop+"\nNumber Of Pepporoni Pizza: "+numPepTop+"\nTotal price: "+calCost();
}




}
