package day59_OOPReview;

public class Encapsulation {

    private int ssn;

     public  int getSSN(){
         return ssn;
     }

     public void setSSN(int ssn){ // final keyword ile yaprsak modify yapamiyoruz , o yuzden setter methodu yazmamizza gerek kalmaz
         this.ssn=ssn; // modify only
     }



}
