package day53_finalKeyword;

public class BreakTimeException extends RuntimeException { // custom unchecked exception

}
class Test{
    public  static void main(String [] args){
       // throw new RuntimeException();
        throw new BreakTimeException();

        // throw new tesT
    }
}