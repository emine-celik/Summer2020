package day47_Encapsulations;

public class Encapsulation {
    private long ssn= 1234566; //private kurdugun sinifin disinda kullanamiyorsun

    public long getSsn(){ // to read only
        return ssn;
    }
    public void  setSsn(long ssn){
        this.ssn=ssn;

    }



}
