package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects2 {
    public static void main(String[] args) {
        Carpet[] carpets={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5,7.5, false);
        carpets[1].customOrder(6.5, 5.5,9.5, true);
        carpets[2].customOrder(7.5, 9.5,10.5, false);
        carpets[3].customOrder(9.5, 12.5,12.5, true);
        carpets[4].customOrder(8.5, 11.5,14.5, false);

        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets)); // add all the carpets
        persianCarpets.removeIf( p -> !p.isPersian);// re,oving the carpets that are not persian



        ArrayList<Carpet>regularCarpets=new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        //regularCarpets.removeIf( p-> p.isPersian);
        regularCarpets.removeAll(persianCarpets);


        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());









    }
}
