package WurmUpStatic;

public class ShoppingList {
    public static void main(String[] args) {

        Item item1=new Item("Domotes",2.90,2);
        Item item2=new Item("Patates",1.99,5);
        Item item3=new Item("Sogan",2.99,4);
        Item item4=new Item("Elma",2.89,2);
        Item item5=new Item("Armut",2.99,1);

        System.out.println(item1);

/*
public class ShoppingList {
        public static void main(String[] args) {
            ArrayList<Item> items = new ArrayList<>();
            Item item1 = new Item("cheese", 10.50, 2);
            Item item2 = new Item("yogurt", 4.50, 1);
            Item item3 = new Item("Doritos", 3.90, 3);
            Item item4 = new Item("Bananas", 0.5, 6);
            Item item5 = new Item("Udon", 5.90, 4);
            items.addAll(Arrays.asList(item1, item2, item3, item4, item5));
            double totalCost = 0;
            for (Item each: items){
                System.out.println(each.toString() + " : " + each.calCost());
                totalCost += each.calCost();
            }
            System.out.println("The total amount of money spent: $" + totalCost);
            // System.out.println(items);
 */




    }
}
