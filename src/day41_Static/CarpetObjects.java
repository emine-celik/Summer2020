package day41_Static;

import java.util.ArrayList;

public class CarpetObjects {

    public static void main(String[] args) {
       /* Carpet carpet1=new Carpet();
        Carpet carpet2=new Carpet();
        Carpet carpet3=new Carpet();
        Carpet carpet4=new Carpet();
        Carpet carpet5=new Carpet();
*/
        //carpet1.customOrder(11.0,12.0,1200.0,true);

        Carpet[] carpets={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

          carpets[0].customOrder(4.5, 3.5,7.5, false);
          carpets[1].customOrder(6.5, 5.5,9.5, true);
          carpets[2].customOrder(7.5, 9.5,10.5, false);
          carpets[3].customOrder(9.5, 12.5,12.5, true);
          carpets[4].customOrder(8.5, 11.5,14.5, false);



       /* for(Carpet each: carpets){
            each.getCarpetInfo();
        }
*/
        ArrayList<Carpet>persianCarpets=new ArrayList<>();
        ArrayList<Carpet>regularCarpets=new ArrayList<>();

        for (int i = 0; i <= carpets.length-1; i++) {
            if(carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            }
        }

        for(Carpet each: carpets) {
            if (each.isPersian) {
                persianCarpets.add(each);
            } else {
                regularCarpets.add(each);
            }
        }

        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());



    }
}
