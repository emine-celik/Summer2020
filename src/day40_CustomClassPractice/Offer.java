package day40_CustomClassPractice;

public class Offer {


    String state;
    double salary;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean hasBenefit;


public void setOfferInfo (String state,double salary, boolean hasPTO, boolean isFullTime, boolean WFH,String jobTitle, boolean hasBenefit) {


    this.state = state;
    this.salary=salary;
    this.hasPTO=hasPTO;
    this.isFullTime=isFullTime;
    this.WFH=WFH;
    this.jobTitle=jobTitle;
    this.hasBenefit=hasBenefit;

}

public void getOfferInfo(){ // display the offer info
    System.out.println("===============================================");
    System.out.println("Salary: $"+salary);
    System.out.println("Job Title: "+jobTitle);
    System.out.println("Location: "+state);
   // System.out.println("");


    System.out.println("==============================================");

}


}
