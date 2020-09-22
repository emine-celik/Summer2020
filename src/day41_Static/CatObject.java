package day41_Static;


import java.util.ArrayList;

public class CatObject {
    public static void main(String[] args) {
        Cat[] cats={new Cat(), new Cat(),new Cat(),new Cat(),new Cat()};

        cats[0].setCatInfo("Pamuk", 3, 'F', "white", "Angora");
        cats[1].setCatInfo("Zarife", 2, 'F', "white", "Van");
        cats[2].setCatInfo("Pasha", 5, 'M', "Gray", "British Shorthair");
        cats[3].setCatInfo("Leo", 4, 'M', "Yellow", "Bengal");
        cats[4].setCatInfo("Mia", 2, 'F', "Gray", "Scottish");

        for(Cat each:cats){
            System.out.println(each);
        }


       ArrayList<Cat> maleCat=new ArrayList<>();
       ArrayList<Cat> femaleCat=new ArrayList<>();








    }
}
