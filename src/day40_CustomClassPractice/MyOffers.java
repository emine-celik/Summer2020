package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        Offer offer6=new Offer();
        Offer offer7=new Offer();

        offer1.setOfferInfo("VA",100000,true,true,true,"SDET",true);
        offer2.setOfferInfo("VA",120000,true,true,true,"SDET",true);
        offer3.setOfferInfo("IL",130000,true,true,true,"SDET",true);
        offer4.setOfferInfo("WI",150000,true,true,true,"SDET",true);
        offer5.setOfferInfo("MADISON",110000,true,true,true,"SDET",true);
        offer6.setOfferInfo("IL",1400000,true,true,true,"SDET",true);
        offer7.setOfferInfo("TEXAS",125000,true,true,false,"SDET",false);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll( Arrays.asList( offer1, offer2,offer3,offer4,offer5,offer6,offer7 ) );

        for( Offer eachOffer : jobOffers){
            eachOffer.getOfferInfo();
        }
        System.out.println("==============================================");
        // less than 120k:
        jobOffers.removeIf( p-> p.salary < 120000);
     //   System.out.println("Number of offers: "+jobOffers);

        // less than 120 or not from VA area
       // jobOffers.removeIf(p-> p.salary < 130000);
       // System.out.println("Number of offers: "+jobOffers);


        // does not have PTO or does not have benefit or is not full time
       // jobOffers.removeIf(p-> p.hasPTO == false || p.hasBenefit == false || p.isFullTime == false || p.salary == 120000);
      //  System.out.println("Number of offers: "+jobOffers);




    }
}
