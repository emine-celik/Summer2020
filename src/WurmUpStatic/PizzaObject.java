package WurmUpStatic;

import java.util.ArrayList;

public class PizzaObject {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaArrayList=new ArrayList<>();

        for (int i = 0; i < 400 ; i++) {
            Pizza pizza1=new Pizza();
            pizza1.setInfo("Large",1,0);
            pizzaArrayList.add(pizza1);
        }

        System.out.println("Total Number of Pizza: "+pizzaArrayList.size());
        double totalPrice=0;

        for(Pizza each:pizzaArrayList){
          totalPrice+=  each.calCost();
        }
        System.out.println("Total Price: "+totalPrice);


        Pizza pizza1=new Pizza();
        Pizza pizza2=new Pizza();
        Pizza pizza3=new Pizza();
        Pizza pizza4=new Pizza();

        pizza1.setInfo("Large",4,2);
        pizza2.setInfo("medium",2,3);
        pizza3.setInfo("small",1,2);
        pizza4.setInfo("xLarge",1,2);


        pizza1.toString();
        pizza2.toString();
        pizza3.toString();
        pizza4.toString();


       // System.out.println(pizza2);
    }
}
