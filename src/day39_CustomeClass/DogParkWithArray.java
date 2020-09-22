package day39_CustomeClass;

public class DogParkWithArray {
    //dogPark
    public static void main(String[] args) {


        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
                       // 0            1         3           4          5


           dogPark[0].setDogInfo("Papi","Small","Small",2,"Brown");
           dogPark[1].setDogInfo("Papi","Big","Small",3,"Gold");
           dogPark[2].setDogInfo("Papi","Small","Small",6,"Black");
           dogPark[3].setDogInfo("Papi","Small","Small",7,"White");
           dogPark[4].setDogInfo("Papi","Small","Small",1,"Mix");

        for (int i = 0; i <= dogPark.length-1 ; i++) {
            dogPark[i].getDogInfo();
        }

        System.out.println("==========================================");

        for(Dog eachDog:dogPark){
            eachDog.getDogInfo();
        }
        System.out.println("===============================================");
        String food="treats";






        System.out.println("==================================================");
        String drink="milk";






        System.out.println("===========================================");
        String play="";





        System.out.println("==============================================");
        String sleep="";

    }
}